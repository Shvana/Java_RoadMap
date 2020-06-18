package hello;

import java.util.Scanner;                //Gets the Scanner class from the package (library) java.util

public class Sample_Java_Program {                 //Name of the class—your choice. “This program should be in a file named Sample_Java_Program.java

    public static void main(String[] args){

        System.out.println("Hello out there");   //Sends output to screen
        System.out.println("I will add two numbers for you.");
        System.out.println("Enter two whole numbers on a line:");


        //Says that n1 and n2 are variables that hold integers (whole numbers)
        int n1;
        int n2;


        Scanner keyboard = new Scanner(System.in);  // Readies the program for keyboard input
        n1 = keyboard.nextInt();                    // Reads one whole number from the keyboard
        n2 = keyboard.nextInt();


        System.out.println("The sum of those two numbers is");
        System.out.println(n1 + n2);

    }
}
