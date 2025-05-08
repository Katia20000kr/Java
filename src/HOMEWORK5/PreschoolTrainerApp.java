package HOMEWORK5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PreschoolTrainerApp extends JFrame {
    private ArrayList<Animal> animals;
    private int currentIndex = 0;

    private JLabel imageLabel;
    private JTextField inputField;
    private JLabel resultLabel;

    public PreschoolTrainerApp() {
        setTitle("Preschool Letter Training");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        // Φτιάχνουμε τα ζώα
        animals = new ArrayList<>();
        animals.add(new Animal("Horse", "src/images/Horse.png"));
        animals.add(new Animal("Dog", "src/images/Dog.png"));
        animals.add(new Animal("Elephant", "src/images/Elephant.png"));

        // Εικόνα
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.NORTH);

        // Πάνελ κεντρικό
        JPanel centerPanel = new JPanel(new FlowLayout());
        inputField = new JTextField(5);
        JButton checkButton = new JButton("Check");
        resultLabel = new JLabel(" ");
        centerPanel.add(inputField);
        centerPanel.add(checkButton);
        centerPanel.add(resultLabel);
        add(centerPanel, BorderLayout.CENTER);

        // Κουμπί Next
        JButton nextButton = new JButton("Next");
        add(nextButton, BorderLayout.SOUTH);

        // Check button λειτουργία
        checkButton.addActionListener(e -> {
            String input = inputField.getText().trim().toUpperCase();
            Animal currentAnimal = animals.get(currentIndex);
            if (input.length() == 1 && input.charAt(0) == currentAnimal.getFirstLetter()) {
                resultLabel.setText("✅ " + input + " is correct for " + currentAnimal.getName() + "!");
            } else {
                resultLabel.setText("❌ Try again!");
            }
        });

        // Next button λειτουργία
        nextButton.addActionListener(e -> {
            currentIndex = (currentIndex + 1) % animals.size(); // κυκλικό
            showAnimal();
        });

        showAnimal(); // δείχνει το πρώτο ζώο
        setVisible(true);
    }

    private void showAnimal() {
        Animal currentAnimal = animals.get(currentIndex);
        imageLabel.setIcon(new ImageIcon(currentAnimal.getImagePath()));
        inputField.setText("");
        resultLabel.setText(" ");
    }

    public static void main(String[] args) {
        new PreschoolTrainerApp();
    }
}
