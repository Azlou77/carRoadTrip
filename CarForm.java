import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarForm extends JFrame {
    private JTextField numberRegisterField, powerField, speedField, kmField, breakdownField;
    private JButton submitButton;
    private JLabel drivLabel, capacityFuelLabel, consumptionLabel, priceLabel, breakdownLabel;

    public CarForm() {
        // Création du formulaire
        setTitle("Car Information Form");
        setSize(400, 500);
        setLayout(new GridLayout(11, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Numéro de matriculation
        add(new JLabel("Numéro de matriculation:"));
        numberRegisterField = new JTextField();
        add(numberRegisterField);

        // Puissance
        add(new JLabel("Puissance:"));
        powerField = new JTextField();
        add(powerField);

        // Vitesse
        add(new JLabel("Vitesse:"));
        speedField = new JTextField();
        add(speedField);

        // Nombre de kilomètres à parcourir
        add(new JLabel("Nombre de kilomètres à parcourir:"));
        kmField = new JTextField();
        add(kmField);

        // Nombre de pannes
        add(new JLabel("Nombre de pannes:"));
        breakdownField = new JTextField();
        add(breakdownField);

        // Bouton de soumission
        submitButton = new JButton("Soumettre");
        add(new JLabel()); // Espace vide pour l'alignement du bouton
        add(submitButton);

        // Labels pour afficher les résultats
        drivLabel = new JLabel("Drive Info: ");
        add(drivLabel);
        add(new JLabel()); // Espace vide

        capacityFuelLabel = new JLabel("Fuel Capacity: ");
        add(capacityFuelLabel);
        add(new JLabel()); // Espace vide

        consumptionLabel = new JLabel("Consumption: ");
        add(consumptionLabel);
        add(new JLabel()); // Espace vide

        priceLabel = new JLabel("Price: ");
        add(priceLabel);
        add(new JLabel()); // Espace vide

        breakdownLabel = new JLabel("Number of Breakdowns: ");
        add(breakdownLabel);
        add(new JLabel()); // Espace vide

        // Action de soumission
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numberRegister = numberRegisterField.getText();
                int power = Integer.parseInt(powerField.getText());
                float speed = Float.parseFloat(speedField.getText());
                int km = Integer.parseInt(kmField.getText());
                int breakdowns = Integer.parseInt(breakdownField.getText());

                // Création d'une instance de Car avec les valeurs saisies
                Car myCar = new Car(power, numberRegister, speed, km);
                myCar.setBreakdown(breakdowns > 0, breakdowns);
                String driveInfo = myCar.drive();
                float consumption = myCar.consume();
                float price = myCar.calculatePrice();

                // Affichage des informations saisies
                JOptionPane.showMessageDialog(CarForm.this, "Numéro de matriculation : " + numberRegister +
                        "\nPuissance : " + power +
                        "\nVitesse : " + speed +
                        "\nNombre de kilomètres à parcourir : " + km +
                        "\nNombre de pannes : " + breakdowns);

                // Mise à jour des labels avec les résultats
                drivLabel.setText("Drive Info: " + driveInfo);
                capacityFuelLabel.setText("Fuel Capacity: " + myCar.getCapacityFuelCar() + " liters");
                consumptionLabel.setText("Consumption: " + consumption + " L/100km");
                priceLabel.setText("Price: $" + price);
                breakdownLabel.setText("Number of Breakdowns: " + breakdowns);
            }
        });

        // Centrer la fenêtre
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CarForm();
    }
}
