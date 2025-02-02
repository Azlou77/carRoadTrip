
import java.util.Scanner;

public class Tank {
    // Attributs
    private String numberRegisterCar;
    private int power;
    private float cost;
    private float capacityFuel;

    // Methods
    public void init(int power, String numberRegisterCar) {
        int capacityFuel = 40;
    }

    public void reduce(float conso, float numberKm) {
    }

    public void fillUp() {
    }

    public float distanceMax(float consumption) {
        Scanner car = new Scanner(System.in);
        System.out.println("Enter your consumption of fuel ");
        int contentFuelCar = car.nextInt();
        return (contentFuelCar / consumption) * 100;
    }
}
