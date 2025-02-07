public class Car {
    // Attributs
    private String numberRegisterCar;
    private float price, totalFuelUsed;
    private int power;
    private final int FUEL_PRICE = 1;
    private Reservoir reservoir;
    private Counter counter;

    public Car(int power, String numberRegisterCar) {
        this.power = power;
        this.numberRegisterCar = numberRegisterCar;
        this.reservoir = new Reservoir(power); // Initialisation de l'objet Reservoir
        this.counter = new Counter();
    }

    public void setSpeed(int speed) {
        this.counter.setSpeed(speed);
    }

    public void setNumberKm(int numberKm) {
        this.counter.setNumberKm(numberKm);
    }

    public String drive() {
        return "I drive for " + counter.getNumberKm() + " kilometers at speed " + counter.getSpeed() + " km/h";
    }

    public int getBreakdown() {
        int breakdowns = 0;
        float fuelNeeded = reservoir.getTotalFuelUsed();
        while (fuelNeeded > reservoir.getCapacityFuelCar()) {
            breakdowns++;
            fuelNeeded -= reservoir.getCapacityFuelCar();
        }
        return breakdowns;
    }

    public float calculatePrice() {
        int breakdown = getBreakdown();
        price = reservoir.getTotalFuelUsed() * FUEL_PRICE + (breakdown * 100);
        return price;
    }

    public float consume() {
        totalFuelUsed = reservoir.consume(counter.getSpeed(), counter.getNumberKm());
        return totalFuelUsed;
    }

    public int getCapacityFuelCar() {
        return reservoir.getCapacityFuelCar();
    }
}
