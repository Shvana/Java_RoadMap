package hello;

import javax.swing.*;

public class hello_interface {
    public static void main(String[] args){
        JFrame frame = new JFrame("Welcome");
        JLabel label = new JLabel("Hello, I'm a program", JLabel.CENTER);
        frame.add(label);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
