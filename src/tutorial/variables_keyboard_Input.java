package tutorial;

import java.util.Scanner;

public class variables_keyboard_Input {
    public static void main(String[] args){
        int numberOfGlass;
        int juicePerGlass;
        int totalJuice;

        Scanner keyboard = new Scanner(System.in);

        numberOfGlass = keyboard.nextInt();
        juicePerGlass = keyboard.nextInt();

        totalJuice = numberOfGlass * juicePerGlass;

        System.out.println("If you have ");
        System.out.println(juicePerGlass + " Juice per glass and ");
        System.out.println(numberOfGlass + " Glass, then ");
        System.out.println("The total number of juice is " + totalJuice);


        juicePerGlass = juicePerGlass -2;
        totalJuice = numberOfGlass * juicePerGlass;
        System.out.println("You now have");
        System.out.println(juicePerGlass + " eggs per basket and");
        System.out.println(numberOfGlass + " baskets.");
        System.out.println("The new total number of eggs is " + totalJuice);
    }
}
