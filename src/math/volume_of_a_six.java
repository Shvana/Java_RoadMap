/*
 This program computes the volume (in liters) of a six-pack of soda
 cans and the total volume of a six-pack and a two-liter bottle.
 */

package math;

public class volume_of_a_six {
    public static void main(String[] args){
        int cansPerPack = 6;
        final double CAN_VOLUME = 0.355; // Liters in a 12-ounce can
        double totalVolume = cansPerPack * CAN_VOLUME;
        System.out.print("A six-pack of 12-ounce cans contains ");
        System.out.print(totalVolume);
        System.out.println(" liters. ");
        final double BOTTLE_VOLUME = 2; // Two-liter bottle
        totalVolume = totalVolume + BOTTLE_VOLUME;
        System.out.print("A six-pack and a two-liter bottle contain ");
        System.out.print(totalVolume);
        System.out.println(" liters. ");
    }
}
