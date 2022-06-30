//  Aim: b) Write a JAVA program that display the x and y position of the cursor movement using Mouse

package com.College_Java_Lab.Exp_12_AWT.Record;

// Source Code:
import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerDemo extends Frame implements MouseMotionListener {
    int x, y;
    String str = "";

    MouseMotionListenerDemo() {
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        str = " Mouse Dragged " + x + " , " + y;
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        str = " Mouse Moved " + x + " , " + y;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(str, x, y);
    }

    public static void main(String[] args) {
        new MouseMotionListenerDemo();
    }
}

// INPUT/OUTPUT:
//      file:Exp_12_b.png