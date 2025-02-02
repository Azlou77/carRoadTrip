
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
        System.out.println(power + "\n" + numberRegisterCar);

    }

    public float consume(float usedFuel, float numberKm) {
        this.numberKm = numberKm;
        consumption = (usedFuel * 100) / numberKm;
        System.out.println("Consumption: " + consumption + " L/100km");
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

    public float calculatePrice(float fuelCostPerLiter) {
        float price = consumption * fuelCostPerLiter;
        System.out.println("Price: $" + price);
        return price;
    }

    private void stop() {
        System.out.println("The car stop");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.init(150, "ABC123");
        myCar.drive(100, 128);
        myCar.stop();
        myCar.consume(9, 100);
        myCar.calculatePrice(1);

    }

}