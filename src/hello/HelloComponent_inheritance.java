package hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloComponent_inheritance {
    public static void main(String[] args){
        JFrame frame = new JFrame("Welcome");
        frame.add(new HelloComponent ("Hello I'm a program"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,900);
        frame.setVisible(true);
    }
    static class HelloComponent extends JComponent implements MouseMotionListener{
        String theMessage;
        int messageX = 125, messageY = 95;
        public HelloComponent(String message){
            theMessage = message;
            addMouseMotionListener(this);
        }
        public void paintComponent(Graphics g){
            g.drawString(theMessage, messageX, messageY);
        }
        public void mouseDragged(MouseEvent e){
            messageX = e.getX();
            messageY = e.getY();
            repaint();
        }
        public void mouseMoved(MouseEvent e){

        }
    }
}
