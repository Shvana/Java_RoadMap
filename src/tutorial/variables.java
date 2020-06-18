package tutorial;

public class variables {
    public static void main(String[] args){

        // Variable declarations
        int numberOfGlass;
        int juicePerGlass;
        int totalJuice;

        // Assignment statement
        numberOfGlass = 32;
        juicePerGlass = 26;

        totalJuice = numberOfGlass * juicePerGlass;

        System.out.println("If you have ");
        System.out.println(juicePerGlass + " Juice per glass and ");
        System.out.println(numberOfGlass + " Glass, then ");
        System.out.println("The total number of juice is " + totalJuice);
    }
}
