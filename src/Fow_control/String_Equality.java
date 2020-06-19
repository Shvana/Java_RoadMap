package Fow_control;

import java.util.Scanner;

public class String_Equality {

    public static void main(String[] args){
        String s1;
        String s2;

        System.out.println("Enter two lines of text:");
        Scanner keyboard = new Scanner(System.in);
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();


        if (s1.equals(s2))                                        //These two invocations of the method equals are equivalent.
            System.out.println("The two lines are equal.");
        else
            System.out.println("The two lines are not equal");
        if (s2.equals(s1))
            System.out.println("The two lines are equal.");
        else
            System.out.println("The tow lines are not equal");
        if (s1.equalsIgnoreCase(s2))                                   // equalsIgnoreCase considers the uppercase and lowercase versions of the same letter to be the same.
            System.out.println("But lines are equal, ignoring case.");
        else
            System.out.println("Lines are not equal. even ignoring case.");
    }
}
