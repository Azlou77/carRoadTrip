public class Car {
    // Attributs
    private String numberRegisterCar;
    private float price, consumption, speed, capacityFuelCar, totalFuelUsed;
    private int numberKm, power, counterCarBreakdown;
    private boolean isBreakdown;
    private static final double COEFFMULTI_POWER = 0.15;
    private static final int FUEL_PRICE = 1;

    public Car(int power, String numberRegisterCar, float speed, int numberKm) {
        this.power = power;
        this.numberRegisterCar = numberRegisterCar;
        this.speed = speed;
        this.numberKm = numberKm;
        checkQuantityFuelCar();
    }

    public void checkQuantityFuelCar() {
        if (power < 7) {
            capacityFuelCar = 40;
        } else {
            capacityFuelCar = 60;
        }
    }

    public float getCapacityFuelCar() {
        return capacityFuelCar;
    }

    public String drive() {
        return "I drive for " + numberKm + " kilometers at speed " + speed + " km/h";
    }

    public float consume() {
        if (speed <= 80) {
            consumption = 6;
        } else if (speed <= 100) {
            consumption = 7;
        } else if (speed <= 120) {
            consumption = 8;
        } else if (speed <= 130) {
            consumption = 9;
        } else {
            // Valeur par défaut si la vitesse est hors de la plage spécifiée
            consumption = -1;
        }
        consumption = (float) (consumption + 0.15 * COEFFMULTI_POWER);
        return consumption;
    }

    public float calculatePrice() {
        totalFuelUsed = (consumption / 100) * numberKm;
        if (isBreakdown) {
            price = totalFuelUsed * FUEL_PRICE + counterCarBreakdown * 100;
        } else {
            price = totalFuelUsed * FUEL_PRICE;
        }
        return price;
    }

    public int isBreakdown() {
        return counterCarBreakdown;
    }

    public void setBreakdown(boolean isBreakdown, int counterCarBreakdown) {
        this.isBreakdown = isBreakdown;
        this.counterCarBreakdown = counterCarBreakdown;
    }
}
