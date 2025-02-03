package Interface1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarForm extends JFrame {
    private JTextField numberRegisterField, powerField, speedField, kmField;
    private JButton submitButton;

    public CarForm() {
        // Création du formulaire
        setTitle("Car Information Form");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
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

        // Bouton de soumission
        submitButton = new JButton("Soumettre");
        add(new JLabel()); // Espace vide pour l'alignement du bouton
        add(submitButton);

        // Action de soumission
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numberRegister = numberRegisterField.getText();
                int power = Integer.parseInt(powerField.getText());
                float speed = Float.parseFloat(speedField.getText());
                int km = Integer.parseInt(kmField.getText());

                // Affichage des informations saisies
                JOptionPane.showMessageDialog(CarForm.this, "Numéro de matriculation : " + numberRegister +
                        "\nPuissance : " + power +
                        "\nVitesse : " + speed +
                        "\nNombre de kilomètres à parcourir : " + km);
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
