package dev.davidsalomon;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JFrame window;
    private JPanel panel;
    private JButton button;

    public MainWindow() {
        initialize();
    }

    public void initialize() {
        this.window = new JFrame();
        this.window.setTitle("Conversor");
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.window.setSize(400, 400);
        this.window.setLocationRelativeTo(null);
        this.panel = new JPanel();
        this.button = createButton();
        this.panel.add(button);
        this.window.add(panel, BorderLayout.CENTER);


    }

    private JButton createButton() {
        JButton button = new JButton("Hello friend");
        button.setFocusable(false);
        return button;
    }

    public void show() {
        this.window.setVisible(true);
    }

    ;
}