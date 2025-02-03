package Version1;

public class Voiture {
    private String immatriculation;
    private int chevaux;
    private Reservoir reservoir;
    private Compteur compteur;

    public Voiture(String immatriculation, int chevaux, int capaciteReservoir) {
        this.immatriculation = immatriculation;
        this.chevaux = chevaux;
        this.reservoir = new Reservoir(capaciteReservoir);
        this.compteur = new Compteur();
    }

    public void rouler(int vitesse, int distance) {
        int distanceParcourue = 0;
        while (distanceParcourue < distance) {
            if (reservoir.contenu > 0) {
                compteur.rouler(vitesse, 100);
                double consommation = calculerConsommation(vitesse, 100);
                reservoir.consommer(consommation);
                distanceParcourue += 100;
            } else {
                System.out.println("Panne d'essence. Dépannage...");
                reservoir.remplir();
                compteur.addCost(100); 
            }
        }
        System.out.println("Voyage terminé. Distance parcourue: " + compteur.getKilometrage() + " km.");
        System.out.println("Coût total du voyage: " + compteur.getCout() + " €.");
    }

 
    private double calculerConsommation(int vitesse, int distance) {
        double consommationBase = 6;
        if (vitesse > 80) consommationBase = 7;
        if (vitesse > 100) consommationBase = 8;
        if (vitesse > 120) consommationBase = 9;

        int chevauxSupplementaires = chevaux - 4;
        if (chevauxSupplementaires > 0) {
            consommationBase += 0.15 * chevauxSupplementaires;
        }

        return (consommationBase / 100) * distance;
    }

}
