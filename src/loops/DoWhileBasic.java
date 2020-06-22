package loops;

import java.util.Scanner;

public class DoWhileBasic {
    public static void main(String[] args){
        int count;
        int number;

        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        count = 1;

        do {
            System.out.println(count + ", ");
            count++;
        } while (count <= number);
        System.out.println("Buckle my shoe.");
    }
}

