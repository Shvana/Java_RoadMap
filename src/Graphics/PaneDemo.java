package Graphics;

import javax.swing.*;

public class PaneDemo {
    public static void main(String[] args){
        String orangeString = JOptionPane.showInputDialog("Enter number of oranges:");
        int orangeCount = Integer.parseInt(orangeString);

        String pineapplesString = JOptionPane.showInputDialog("Enter number of pineapples:");
        int pineapplesCount = Integer.parseInt(pineapplesString);
        int totalFruitCount = orangeCount + pineapplesCount;

        JOptionPane.showMessageDialog(null, "The total of fruits = " + totalFruitCount);
        System.exit(0);
    }
}
