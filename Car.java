package Interface1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Car {
    // Attributs
    private String numberRegisterCar;
    private float price, consumption, speed, capacityFuelCar, totalFuelUsed;
    private int numberKm, power, counterCarBreakdown;
    private boolean isBreakdown;
    private static final double COEFFMULTI_POWER = 0.15;
    private static final int FUEL_PRICE = 1;

    public void initCar(int power, String numberRegisterCar) {
        System.out.println(power + "\n" + numberRegisterCar);
    }

    public void checkQuantityFuelCar() {
        if (power < 7) {
            capacityFuelCar = 40;
        } else {
            capacityFuelCar = 60;
        }
    }

    public float getSpeed() {
        JFrame frame = new JFrame("Input Speed");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter a speed: ");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                speed = Float.parseFloat(textField.getText());
                JOptionPane.showMessageDialog(frame, "La vitesse saisie est : " + speed);
                frame.dispose();
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        frame.add(panel);

        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Wait until the frame is disposed
        while (frame.isShowing()) {
            // No operation, just wait
        }

        return speed;
    }

    // Méthode principale pour lancer l'application
    public static void main(String[] args) {
        Car car = new Car();
        car.initCar(120, "1234-AB-56");
        car.checkQuantityFuelCar();
        float speed = car.getSpeed();
        System.out.println("La vitesse saisie est : " + speed);
    }
}
