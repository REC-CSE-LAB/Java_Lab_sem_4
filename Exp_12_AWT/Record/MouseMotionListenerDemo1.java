//  Aim: a) Write a JAVA program to paint like paint brush in applet

package com.College_Java_Lab.Exp_12_AWT.Record;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerDemo1 extends Frame implements MouseMotionListener {
    MouseMotionListenerDemo1() {
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public void mouseMoved(MouseEvent e) {
    }

    public static void main(String[] args) {
        new MouseMotionListenerDemo1();
    }
}

// INPUT/OUTPUT:
//      file:Exp_12_a.png