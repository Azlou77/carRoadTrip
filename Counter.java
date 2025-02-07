public class Counter {
    private int speed;
    private int numberKm;

    public Counter() {
        this.speed = 0;
        this.numberKm = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public int getNumberKm() {
        return numberKm;
    }

    public void setNumberKm(int newNumberKm) {
        this.numberKm = newNumberKm;
    }
}
