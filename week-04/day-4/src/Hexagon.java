import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {

  private static Graphics canvas;

 /* public static void mainDraw(Graphics graphics){

    fractalTrianle(x1, y1, x2, y2, graphics);
  }

  public static void drawTriangle(Graphics g, int x1, int y1, int x2, int y2){

    drawTriangle();
    g.drawLine(WIDTH/2, 2, WIDTH - WIDTH/4, HEIGHT/2);
    g.drawLine(WIDTH - WIDTH/4, HEIGHT/2, WIDTH/4, HEIGHT/2);
    g.drawLine(WIDTH/4, HEIGHT/2, WIDTH/2, 2);
  }

  public static void fractalTrianle(int x1, int y1, int x2, int y2, Graphics g){
    drawTriangle(g, x1, y1, x2, y2);

    fractalTrianle(WIDTH/2, 2, WIDTH - WIDTH/4, HEIGHT/2);
    fractalTrianle(WIDTH - WIDTH/4, HEIGHT/2, WIDTH/4, HEIGHT/2);
    fractalTrianle(WIDTH/4, HEIGHT/2, WIDTH/2, 2);
  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
    panel.setBackground(Color.white);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }*/
}
