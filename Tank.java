
import java.util.Scanner;

public class Tank {
    // Attributs
    private String numberRegisterCar;
    private float cost;

    // Methods
    public void init(int power, String numberRegisterCar) {
        float capacityFuelCar;
        if (power < 7) {
            capacityFuelCar = 40;
        } else {
            capacityFuelCar = 60;
        }
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
