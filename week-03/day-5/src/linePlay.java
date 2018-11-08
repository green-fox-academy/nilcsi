import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class linePlay {

    public static void mainDraw(Graphics graphics){

        int num = 15;

        for (int i = 0; i < num; i++) {
            int x = i * WIDTH / (num - 1);
            int y = i * HEIGHT / (num - 1);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, y, x, HEIGHT);
            graphics.setColor(new Color (138,43,226));
            graphics.drawLine(x, 0, WIDTH, y);
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
