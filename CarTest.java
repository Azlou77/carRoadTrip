import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testSetSpeed() {
        Car car = new Car(5, "AB-123-CD");
        car.setSpeed(80);
        assertEquals(80, car.counter.getSpeed(), "La vitesse devrait être de 80 km/h");
    }

    @Test
    public void testSetNumberKm() {
        Car car = new Car(5, "AB-123-CD");
        car.setNumberKm(100);
        assertEquals(100, car.counter.getNumberKm(), "Le nombre de kilomètres devrait être de 100 km");
    }

    @Test
    public void testDrive() {
        Car car = new Car(5, "AB-123-CD");
        car.setSpeed(80);
        car.setNumberKm(100);
        assertEquals("I drive for 100 kilometers at speed 80 km/h", car.drive(),
                "Le message de conduite devrait correspondre aux valeurs définies");
    }

    @Test
    public void testGetBreakdown() {
        Car car = new Car(5, "AB-123-CD");
        car.setNumberKm(1000);
        car.setSpeed(120);
        car.consume();
        assertTrue(car.getBreakdown() > 0, "Le nombre de pannes devrait être supérieur à 0 pour une longue distance");
    }

    @Test
    public void testCalculatePrice() {
        Car car = new Car(5, "AB-123-CD");
        car.setNumberKm(1000);
        car.setSpeed(120);
        car.consume();
        assertTrue(car.calculatePrice() > 0, "Le prix devrait être supérieur à 0 pour une longue distance");
    }

    @Test
    public void testConsume() {
        Car car = new Car(5, "AB-123-CD");
        car.setNumberKm(100);
        car.setSpeed(80);
        assertTrue(car.consume() > 0, "La consommation de carburant devrait être supérieure à 0");
    }

    @Test
    public void testGetCapacityFuelCar() {
        Car car = new Car(5, "AB-123-CD");
        assertEquals(40, car.getCapacityFuelCar(),
                "La capacité du réservoir devrait être de 40 litres pour une puissance de 5");
    }
}
