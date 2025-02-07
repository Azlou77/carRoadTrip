import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservoirTest {

    @Test
    public void testGetCapacityFuelCar() {
        Reservoir reservoir = new Reservoir(5);
        assertEquals(40, reservoir.getCapacityFuelCar(),
                "La capacité du réservoir devrait être de 40 litres pour une puissance de 5");
    }

    @Test
    public void testConsume() {
        Reservoir reservoir = new Reservoir(5);
        assertTrue(reservoir.consume(80, 100) > 0,
                "La consommation de carburant devrait être supérieure à 0 pour une vitesse de 80 km/h sur 100 km");
    }

    @Test
    public void testGetFill() {
        Reservoir reservoir = new Reservoir(5);
        reservoir.consume(120, 1000);
        assertTrue(reservoir.getFill() > 0,
                "Le nombre de remplissages devrait être supérieur à 0 pour une longue distance");
    }

    @Test
    public void testGetContentFuel() {
        Reservoir reservoir = new Reservoir(5);
        assertEquals(40, reservoir.getContentFuel(), "Le contenu initial du réservoir devrait être de 40 litres");
    }

    @Test
    public void testGetTotalFuelUsed() {
        Reservoir reservoir = new Reservoir(5);
        reservoir.consume(80, 100);
        assertTrue(reservoir.getTotalFuelUsed() > 0,
                "Le total de carburant utilisé devrait être supérieur à 0 après consommation");
    }
}
