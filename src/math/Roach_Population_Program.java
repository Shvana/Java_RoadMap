/*
 Program to calculate how long it will take a population of
 roaches to completely fill a house from floor to ceiling.
 */
package math;

import java.util.Scanner;

public class Roach_Population_Program {
    public static final double growth_rate = 0.95;       //95% per week
    public static final double one_bug_volume = 0.002;  //cubic feet/

    public static void main(String[] args){
        System.out.println("Enter the total volume of your house");
        System.out.println("in cubic feet: ");
        Scanner keyboard = new Scanner(System.in);
        double houseVolume = keyboard.nextInt();


        System.out.println("Enter the estimated number of");
        System.out.println("roaches in you house: ");
        int startPopulation = keyboard.nextInt();
        int countWeeks = 0;
        double population = startPopulation;
        double totalBugVolume = population * one_bug_volume;
        double newBugs, newBugVolume;

        while (totalBugVolume < houseVolume){
            newBugs = population * growth_rate;
            newBugVolume = newBugs * one_bug_volume;
            population = population + newBugs;
            totalBugVolume = totalBugVolume + newBugVolume;
            countWeeks++;
        }
        System.out.println("Starting with a roach population of " + startPopulation);
        System.out.println("and a house with a volume of " + houseVolume + " cubic feet,");
        System.out.println("after " + countWeeks + " weeks,");
        System.out.println("the house will be filled with " + (int)population + " roaches.");
        System.out.println("They will fill a volume of " + (int)totalBugVolume + " cubic feet.");
        System.out.println("Better call Debugging Experts Inc.");
    }
}
