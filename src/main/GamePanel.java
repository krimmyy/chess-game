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

    // launchGame method which starts up the game
    // by initialising the thread
    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    // run method is called when starting a thread
    @Override
    public void run() {

        // GAME LOOP
        // used for updating and repainting the board
        // runs 60 times per second
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    private void update() {

    }

    // paintCompoment method used for the creating
    // the graphics for the board and painting it
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
