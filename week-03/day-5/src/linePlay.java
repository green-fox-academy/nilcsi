import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class linePlay {
    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.GREEN);
        for (int i = WIDTH/15; i < WIDTH - WIDTH/15; i += WIDTH / 15) {
            graphics.drawLine(i, HEIGHT, 0, HEIGHT - WIDTH + i);
        }
        graphics.setColor(Color.MAGENTA);
        for (int i = WIDTH - WIDTH/15; i > WIDTH/15; i -= WIDTH / 15) {
            graphics.drawLine(i, 0, WIDTH, HEIGHT - WIDTH + i);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        envelopeStar.ImagePanel panel = new envelopeStar.ImagePanel();
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