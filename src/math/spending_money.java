package math;

import java.util.Scanner;

public class spending_money {
    public static final int spending_money = 100;
    public static final int max_items = 3;
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean haveMoney = true;
        int leftToSpend = spending_money;
        int totalSpent = 0;
        int itemNumber = 1;
        while (haveMoney && (itemNumber <= max_items)){
            System.out.println("You may buy up to " + (max_items - itemNumber +1) + " items");
            System.out.println("costing on more than $" + leftToSpend + ".");
            System.out.println("Enter cost of item #" + itemNumber + ": $");

            int itemCost = keyboard.nextInt();
            if (itemCost <= leftToSpend){
                System.out.println("you may buy this item. ");
                totalSpent = totalSpent + itemCost;
                System.out.println("You spent $" + totalSpent + " so far.");
                leftToSpend = spending_money -totalSpent;
                if (leftToSpend > 0)
                    itemNumber++;
                else{
                    System.out.println("You are out of money.");
                    haveMoney = false;
                }
            }
            else
                System.out.println("You cannot buy that item.");
        }
        System.out.println("you spent $" +totalSpent + ", and are done shopping");
    }
}
