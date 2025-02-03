package Version1;

public class Reservoir {
    private int capacite;
    public double contenu;

    public Reservoir(int capacite) {
        this.capacite = capacite;
        this.contenu = capacite;
    }

    public void consommer(double litres) {
        contenu =contenu- litres;
        if (contenu < 0) contenu = 0;
    }

    public void remplir() {
        contenu = capacite;
    }
}
