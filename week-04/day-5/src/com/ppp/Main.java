package com.ppp;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        int size = 600;
        int xStart = 0;
        int yStart = 0;
        drawMyFractal(xStart, yStart, size, graphics);
    }

    private static void drawMyCircle(int xStart, int yStart, int size, Graphics graphics) {
        graphics.drawOval(xStart, yStart, size, size);
    }

    private static void drawMyFractal(int xStart, int yStart, int size, Graphics graphics) {
        drawMyCircle(xStart, yStart, size, graphics);
        if(size > 45) {
            drawMyFractal(xStart + size / 4, yStart, size / 2, graphics);
            drawMyFractal(xStart, yStart + size / 4, size / 2, graphics);
            drawMyFractal(xStart + size / 2, yStart + size / 4, size /2, graphics );

        }
    }

    // Don't touch the code below
    static int WIDTH = 620;
    static int HEIGHT = 643;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
