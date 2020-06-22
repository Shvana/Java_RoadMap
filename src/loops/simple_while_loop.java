package loops;

import java.util.Scanner;

public class simple_while_loop {
    public static void main(String[] args){
        int count;
        int number;
        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        count = 1;
        while (count <= number){
            System.out.println(count + ", ");
            count++;
        }
        System.out.println();
        System.out.println("Buckle my shoe.");
    }
}
