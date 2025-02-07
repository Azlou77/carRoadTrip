import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    @Test
    public void testGetSpeed() {
        Counter counter = new Counter();
        counter.setSpeed(80);
        assertEquals(80, counter.getSpeed(), "La vitesse devrait être de 80 km/h");
    }

    @Test
    public void testSetSpeed() {
        Counter counter = new Counter();
        counter.setSpeed(100);
        assertEquals(100, counter.getSpeed(), "La vitesse devrait être de 100 km/h");
    }

    @Test
    public void testGetNumberKm() {
        Counter counter = new Counter();
        counter.setNumberKm(100);
        assertEquals(100, counter.getNumberKm(), "Le nombre de kilomètres devrait être de 100 km");
    }

    @Test
    public void testSetNumberKm() {
        Counter counter = new Counter();
        counter.setNumberKm(200);
        assertEquals(200, counter.getNumberKm(), "Le nombre de kilomètres devrait être de 200 km");
    }
}
