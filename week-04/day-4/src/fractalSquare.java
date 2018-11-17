import javax.swing.*;

    import java.awt.*;

    import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class fractalSquare {

  private static Graphics canvas;

  public static void mainDraw(Graphics graphics){

    int size = 400;
    int x = 1;
    int y = 1;

    drawFractal(x, y, size, graphics);

  }

  public static void draw(int x, int y, int size, Graphics graphics){
    graphics.setColor(Color.black);
    graphics.drawRect(x, y, size, size);
  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    draw(x,y, size, graphics);

    if(size > 3) {
      drawFractal(x + size / 3, y, size / 3, graphics);
      drawFractal(x, y + size / 3, size / 3, graphics);
      drawFractal(x + size * 1 / 3, y + size * 2 / 3, size / 3, graphics);
      drawFractal(x + size * 2 / 3, y + size * 1 / 3, size / 3, graphics);
    }
  }


  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
    panel.setBackground(Color.yellow);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
