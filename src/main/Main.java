package main;

import javax.swing.*;


    // Creating the game of Chess in Java
    // Main class for the implementation of the game

public class Main {

    public static void main(String[] args) {

        // Creating JFrame and making sure it closes the game after exited out
        JFrame window = new JFrame("Java Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // Adding Game Panel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();


        // Setting the game window to be in the middle and
        // For it to be visible
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}
