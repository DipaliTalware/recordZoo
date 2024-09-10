package org.newfische.recapproject;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Rea", 30, "Berlin");
        Owner owner2 = new Owner("Kia", 32, "Frankfurt");
        Owner owner3 = new Owner("Meena", 20, "Munich");

        Species species = new Species("CAT", 20);
        Species deers = new Species("DEER", 30);

        Animal cat = new Animal(1, "Pipa the Cat", 4, owner1, species);
        Animal dog = new Animal(2, "Tom", 5, owner2, species);
        Animal deer = new Animal(3, "Deery", 2, owner3, deers);

        Zoo zoo = new Zoo(List.of(deer, dog, cat));

        int totalFoodRequirementOfAllAnimals = zoo.calculateTotalFoodRequirementOfAllAnimals();
        System.out.println("Total food requirement of all animals in the zoo is: " + totalFoodRequirementOfAllAnimals);


        System.out.println(deer.name());
        System.out.println(cat.equals(dog));
        System.out.println(cat.toString());

        System.out.println(deer.age());

        System.out.println(deer.hashCode());
        System.out.println(deer.species());

        System.out.println(dog);
        System.out.println(deer);
    }
}