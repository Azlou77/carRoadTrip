package Version1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {
    private JTextField numberRegisterField, powerField, speedField, kmField;
    private JButton submitButton;
    private Voiture voiture;
    
    public Main() {

        setTitle("Car Information Form");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        add(new JLabel("Numéro de matriculation:"));
        numberRegisterField = new JTextField();
        add(numberRegisterField);


        add(new JLabel("Puissance:"));
        powerField = new JTextField();
        add(powerField);


        add(new JLabel("Vitesse:"));
        speedField = new JTextField();
        add(speedField);


        add(new JLabel("Nombre de kilomètres à parcourir:"));
        kmField = new JTextField();
        add(kmField);


        submitButton = new JButton("Soumettre");
        add(new JLabel()); 
        add(submitButton);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numberRegister = numberRegisterField.getText();
                int power = Integer.parseInt(powerField.getText());
                int speed = Integer.parseInt(speedField.getText());
                int km = Integer.parseInt(kmField.getText());

                voiture = new Voiture(numberRegister, power, speed);
                voiture.rouler(km, speed);


                JOptionPane.showMessageDialog(Main.this, "Numéro de matriculation : " + numberRegister + 
                        "\nPuissance : " + power + 
                        "\nVitesse : " + speed + 
                        "\nNombre de kilomètres à parcourir : " + km);


                dispose();
            }
        });


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);

        setVisible(true);
    }

    public Voiture getVoiture() {
        return voiture;
    }
    
    public static void main(String[] args) {
        Main carForm = new Main();
        

        carForm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Voiture voiture = carForm.getVoiture();
                if (voiture != null) {

                    System.out.println("Voiture créée : " + voiture);
                } else {
                    System.out.println("Aucune voiture créée.");
                }
            }
        });
    }
}

