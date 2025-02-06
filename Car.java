public class Car {
    // Attributs
    private String numberRegisterCar;
    private float price, consumption, speed, capacityFuelCar, totalFuelUsed;
    private int numberKm, power, counterCarBreakdown;
    private double COEFFMULTI_POWER;
    private final int FUEL_PRICE = 1;

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

    public double addCoefficientPower() {
        if (power > 4) {
            COEFFMULTI_POWER *= 2;
        }
        return COEFFMULTI_POWER;
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
            consumption = 0.06f;
        } else if (speed <= 100) {
            consumption = 0.07f;
        } else if (speed <= 120) {
            consumption = 0.08f;
        } else if (speed <= 130) {
            consumption = 0.09f;
        } else {
            // Valeur par défaut si la vitesse est hors de la plage spécifiée
            consumption = -1f;
        }
        consumption = (float) (consumption + COEFFMULTI_POWER);
        totalFuelUsed = consumption * numberKm;
        return totalFuelUsed;
    }

    public float calculatePrice() {
        int breakdowns = isBreakdown();
        price = totalFuelUsed * FUEL_PRICE + breakdowns * 100;
        return price;
    }
}