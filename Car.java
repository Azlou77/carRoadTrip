
import java.util.Scanner;

public class Car {
    // Attributs
    private String numberRegisterCar;
    private float price, consumption, speed, capacityFuelCar;
    private int numberKm, power;
    private static final double COEFFMULTI_POWER = 0.15;
    private static final int FUEL_PRICE = 1;

    public void initCar(int power, String numberRegisterCar) {
        System.out.println(power + "\n" + numberRegisterCar);

    }

    public void checkQuantityFuelCar() {
        if (power < 7) {
            capacityFuelCar = 40;
        } else {
            capacityFuelCar = 60;
        }
    }

    public float getSpeed() {
        Scanner car = new Scanner(System.in);
        System.out.println("Enter a speed");
        speed = car.nextInt();
        return speed;
    }

    public void drive() {
        numberKm = 100; // Mise à jour de la variable d'instance numberKm
        System.out.println("I drive for " + numberKm + " kilometers at speed " + getSpeed() + " km/h");
    }
    // public void stop() {
    // System.out.println("The car stop");
    // }

    public void consume() {
        if (speed <= 80) {
            consumption = 6;
        } else if (speed <= 100) {
            consumption = 7;
        } else if (speed <= 120) {
            consumption = 8;
        } else if (speed <= 130) {
            consumption = 9;
        } else {
            // Value default if speed off the array
            consumption = -1;
        }
        consumption = (float) (consumption + 0.15 * COEFFMULTI_POWER);
        System.out.println("My consumption is " + consumption + "L/Km");
    }

    public void calculatePrice() {
        float totalFuelUsed = (consumption / 100) * numberKm;
        price = totalFuelUsed * FUEL_PRICE;
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.initCar(6, "ABC123");
        myCar.getSpeed();
        myCar.drive();
        myCar.consume();
        myCar.calculatePrice();

    }

}
