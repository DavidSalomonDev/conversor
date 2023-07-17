package dev.davidsalomon.ui;

import dev.davidsalomon.functions.ConversorDistancia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorDistanciaUI {
    private JFrame frame;
    private JPanel panel;
    private JTextField inputField;
    private JComboBox<String> conversionDirectionComboBox;
    private JComboBox<String> optionsComboBox;

    public ConversorDistanciaUI() {
        initialize();
        createUI();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConversorDistanciaUI();
            }
        });
    }

    public void initialize() {
        frame = new JFrame();
        frame.setTitle("Conversor de Distancia");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();
        frame.add(panel, BorderLayout.CENTER);
    }

    public void createUI() {
        panel.setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Distancia:");
        panel.add(inputLabel);

        inputField = new JTextField(10);
        panel.add(inputField);

        String[] conversionDirections = {"Kilómetros a Millas", "Millas a Kilómetros"};
        conversionDirectionComboBox = new JComboBox<>(conversionDirections);
        panel.add(conversionDirectionComboBox);

        JButton convertButton = new JButton("Convertir");
        panel.add(convertButton);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                double distancia = Double.parseDouble(inputText);

                String selectedConversionDirection = (String) conversionDirectionComboBox.getSelectedItem();
                ConversorDistancia converter = new ConversorDistancia(distancia);

                double convertedDistance;
                if (selectedConversionDirection.equals("Kilómetros a Millas")) {
                    convertedDistance = converter.fromKm(ConversorDistancia.TipoDistancia.KM);
                } else {
                    convertedDistance = converter.fromMile(ConversorDistancia.TipoDistancia.MILE);
                }

                JOptionPane.showMessageDialog(frame, distancia + " " + selectedConversionDirection + " equivale a " + convertedDistance + " " + (selectedConversionDirection.equals("Kilómetros a Millas") ? "Millas" : "Kilómetros"));
            }
        });

        frame.setVisible(true);
    }
}