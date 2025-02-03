
import java.util.Scanner;

public class Car {
    // Attributs
    private String numberRegisterCar;
    private float price, consumption, speed, capacityFuelCar, totalFuelUsed;;
    private int numberKm, power, counterCarBreakdown;
    private boolean isBreakdown;
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

    public void isBreakdown() {
        Scanner car = new Scanner(System.in);
        System.out.println("Is your car broken down? (true/false)");
        String enterText = car.nextLine();
        if (enterText.equalsIgnoreCase("true")) {
            isBreakdown = true;
            System.out.println("How many breakdowns does your car have?");
            int enterNumber = car.nextInt();
            counterCarBreakdown = enterNumber;
            System.out.println("Number of breakdowns: " + counterCarBreakdown);
        } else if (enterText.equalsIgnoreCase("false")) {
            isBreakdown = false;
            counterCarBreakdown = 0;
            System.out.println("Number of breakdowns: " + counterCarBreakdown);
        }
    }

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
        totalFuelUsed = (consumption / 100) * numberKm;
        if (isBreakdown) {
            price = totalFuelUsed * FUEL_PRICE + counterCarBreakdown * 100;
        } else {
            price = totalFuelUsed * FUEL_PRICE;
        }
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.initCar(6, "ABC123");
        myCar.getSpeed();
        myCar.drive();
        myCar.isBreakdown();
        myCar.consume();
        myCar.calculatePrice();

    }

}
