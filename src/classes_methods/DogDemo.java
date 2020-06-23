package classes_methods;

public class DogDemo {
    public static void main(String[] args){
        Dog jhon = new Dog();
        jhon.name = "Jhon";
        jhon.age = 8;
        jhon.breed = "Siberian Husky";
        jhon.writeOutput();

        Dog scooby = new Dog();
        scooby.name = "Scooby";
        scooby.age = 43;
        scooby.breed = "Great Dane";

        System.out.println(scooby.name + " is a " + scooby.breed + ",");
        System.out.println("He is " + scooby.age + " years old, or ");
        int  humanYears = scooby.getAgeInHumanYears();
        System.out.println(humanYears + " in human years.");

    }
}
