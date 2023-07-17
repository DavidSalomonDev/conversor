package dev.davidsalomon;

import dev.davidsalomon.ui.ConversorDistanciaUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JFrame window;
    private JPanel panel;
    private JComboBox<String> optionsComboBox;
    private JLabel descriptionLabel;

    public MainWindow() {
        initialize();
        createUI();
    }

    public void initialize() {
        this.window = new JFrame();
        this.window.setTitle("Conversor");
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(400, 200);
        this.window.setLocationRelativeTo(null);
        this.panel = new JPanel();
        this.window.add(panel, BorderLayout.CENTER);

    }

    public void createUI() {
        panel.setLayout(new FlowLayout());

        descriptionLabel = new JLabel("*** Seleccione una opción: ***");
        panel.add(descriptionLabel);

        String[] options = {"Conversor de distancia", "Conversor de moneda", "Conversor de temperatura", "Salir"};
        optionsComboBox = new JComboBox<>(options);
        panel.add(optionsComboBox);

        JButton convertButton = new JButton("Convertir");
        panel.add(convertButton);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) optionsComboBox.getSelectedItem();
                switch (selectedOption) {
                    case "Conversor de distancia":
                        ConversorDistanciaUI conversorDistanciaUI = new ConversorDistanciaUI();
                        conversorDistanciaUI.createUI();
                        window.dispose();
                        break;
                    case "Conversor de moneda":
                        // Aquí llamarías a la funcionalidad correspondiente
                        System.out.println("Conversor de moneda seleccionado");
                        break;
                    case "Conversor de temperatura":
                        // Aquí llamarías a la funcionalidad correspondiente
                        System.out.println("Conversor de temperatura seleccionado");
                        break;
                    case "Salir":
                        window.dispose();
                        System.exit(0);
                        break;
                }
            }
        });
    }

    public void show() {
        this.window.setVisible(true);
    }


}