package ru.vaseba.model.x.gui;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() throws Exception {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setBounds(50, 50, 700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Map());
        setVisible(true);
    }
}
