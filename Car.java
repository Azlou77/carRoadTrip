public class Car {
    // Attributs
    private String numberRegisterCar;
    private float price, consumption, speed, capacityFuelCar, totalFuelUsed;
    private int numberKm, power, counterCarBreakdown;
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

    public int isBreakdown() {
        int breakdowns = 0;
        float fuelNeeded = totalFuelUsed;
        while (fuelNeeded > capacityFuelCar) {
            breakdowns++;
            fuelNeeded -= capacityFuelCar;
        }
        return breakdowns;
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
        totalFuelUsed = (consumption / 100) * numberKm;
        return consumption;
    }

    public float calculatePrice() {
        int breakdowns = isBreakdown();
        price = totalFuelUsed * FUEL_PRICE + breakdowns * 100;
        return price;
    }
}
