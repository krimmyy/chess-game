package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {

    // Initialising the variables
    public static final int WIDTH = 1100;
    public static final int HEIGHT = 800;
    final int FPS = 60;
    Thread gameThread;

    // GamePanel method which sets the size and color of
    // the background of the game
    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
    }

    @Override
    public void run() {

    }

    private void update() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
