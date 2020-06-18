package Fow_control;

import java.util.Scanner;

public class switch_Statement {
    public static void main(String[] args) {
        int numberOfAnimals;
        System.out.println("Enter number of animals: ");
        Scanner keyboard = new Scanner(System.in);
        numberOfAnimals = keyboard.nextInt();


        switch (numberOfAnimals){
            case 1:
                System.out.println("Congratulations.");
                break;
            case 2:
                System.out.println("Wow. Twins.");
            case 3:
                System.out.println("Wow. Triplets.");
            case 4:
            case 5:
                System.out.println("Unbelievable; ");
                System.out.println(numberOfAnimals + " Animals.");
                break;
            default:
                System.out.println("I don't believe you.");
                break;
        }

    }
}
