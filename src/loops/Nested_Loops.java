package loops;

import java.util.Scanner;

/**
 Computes the average of a list of (nonnegative) exam scores.
 Repeats computation for more exams until the user says to stop.
 */

public class Nested_Loops {
    public static void main(String[] args){
        System.out.println("This program computes the average of");
        System.out.println("a list of (nonnegative) exam scores.");
        double sum;
        int numberOfStudents;
        double next;
        String answer;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("\nEnter all the scores to be averaged.");
            System.out.println("Enter a negative number after");
            System.out.println("you have entered all score.");
            sum = 0;
            numberOfStudents = 0;
            next = keyboard.nextDouble();
            while (next >= 0) {
                sum = sum +next;
                numberOfStudents++;
                next = keyboard.nextDouble();
            }
            if (numberOfStudents > 0)
                System.out.println("the average is " + sum / numberOfStudents);
            else
                System.out.println("no scores to average.");
            System.out.println("Want to average another exam?");
            System.out.println("Enter yes or no.");
            answer = keyboard.next();
        } while (answer.equalsIgnoreCase("yes"));
    }
}
