public class Counter {
    private float speed;
    private float numberKm;

    public void init() {
        speed = 0;
        numberKm = 0;

    }

    public float getSpeed() {
        return speed;

    }

    public float setSpeed(float newSpeed) {
        this.speed = newSpeed;
        return newSpeed;

    }

    public float getNumberKm() {
        return numberKm;

    }

    public float setNumberKm(float newNumberKm) {
        this.numberKm = newNumberKm;
        return newNumberKm;

    }
}
