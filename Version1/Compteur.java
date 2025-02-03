package Version1;

public class Compteur {
    private int kilometrage;
    private double cout;

    public void rouler(int vitesse, int distance) {
        this.kilometrage += distance;
        this.cout += distance * 1; 
    }

    public void addCost(double additionalCost) {
        this.cout += additionalCost;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public double getCout() {
        return cout;
    }
}
