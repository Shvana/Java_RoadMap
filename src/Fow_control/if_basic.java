package Fow_control;

import java.util.Scanner;

public class if_basic {
    public static void main(String[] args){

        int number;

        System.out.println("Enter you number bro!");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        if (number < 10)
            System.out.println("Number < 10");
        else if (number <50)
            System.out.println("Number >= 10 and number <50");
        else if (number < 100)
            System.out.println("Number >=50 and number < 100");
        else
            System.out.println("Number >= 100");
    }
}
