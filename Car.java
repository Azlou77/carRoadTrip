
import java.util.Scanner;

public class Car {
    // Attributs
    private String numberRegisterCar;
    private int power;
    private float cost;
    private float numberKm;
    private float consumption;

    // Methods
    public void init(int power, String numberRegisterCar) {

    }

    public float consume() {
        int usedFuel = 9;
        consumption = (usedFuel * 100) / numberKm;
        return consumption;
    }

    public void drive(float numberKm, float speed) {
        speed = 128;
        numberKm = 100;
        System.out.println("I drive for" + numberKm + "kilometers " + "at speed" + speed + "km/h");

    }

    // private void breakdown() {

    // }

    // private void fillUp() {

    // }
    private float calculatePrice() {
        float price = consumption * 1;
        return price;
    }

    private void stop() {
        System.out.println("The car stop");
    }

    public static void main(String[] args) {
        drive();

    }

}