public class Reservoir {
    private float totalFuelUsed;
    private int capacityFuelCar;
    private double contentFuel;
    private int power;
    private double COEFFMULTI_POWER;

    public Reservoir(int power) {
        this.power = power;
        this.capacityFuelCar = getCapacityFuelCar();
        this.contentFuel = capacityFuelCar;
    }

    public int getCapacityFuelCar() {
        if (power >= 4 && power <= 6) {
            return 40;
        } else if (power >= 7 && power <= 200) {
            return 60;
        }
        return 0;
    }

    public double addCoefficientPower() {
        if (power > 4) {
            COEFFMULTI_POWER *= 2;
        }
        return COEFFMULTI_POWER;
    }

    public float consume(int speed, int numberKm) {
        float consumption;
        if (speed > 1 && speed <= 80) {
            consumption = 0.06f;
        } else if (speed > 80 && speed <= 100) {
            consumption = 0.07f;
        } else if (speed > 100 && speed <= 120) {
            consumption = 0.08f;
        } else if (speed > 120 && speed <= 130) {
            consumption = 0.09f;
        } else {
            // Valeur par défaut si la vitesse est hors de la plage spécifiée
            consumption = -1f;
        }

        consumption = (float) (consumption + COEFFMULTI_POWER);
        totalFuelUsed = consumption * numberKm;
        return totalFuelUsed;
    }

    public int getFill() {
        int filling = 0;
        while (totalFuelUsed > capacityFuelCar) {
            filling++;
            totalFuelUsed -= capacityFuelCar;
        }
        return filling;
    }

    public double getContentFuel() {
        return contentFuel;
    }

    public float getTotalFuelUsed() {
        return totalFuelUsed;
    }
}
