import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class envelopeStar {

    public static void mainDraw(Graphics graphics){

        int num = 10;

        for (int i = 0; i < num; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH / 2, i * num, WIDTH / 2 + i * num, HEIGHT / 2);
            graphics.drawLine(WIDTH / 2, i * num, WIDTH / 2 - i * num, HEIGHT / 2);
            graphics.drawLine(WIDTH / 2, HEIGHT - (i * num), WIDTH / 2 + (i * num), HEIGHT / 2);
            graphics.drawLine(WIDTH / 2, HEIGHT - (i * num), WIDTH / 2 - (i * num), HEIGHT / 2);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}