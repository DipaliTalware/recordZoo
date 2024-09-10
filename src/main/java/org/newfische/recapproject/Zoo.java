package org.newfische.recapproject;

import java.util.List;

public record Zoo(List<Animal> animals) {
    public int calculateTotalFoodRequirementOfAllAnimals(){
        int totalFood =0;
        for (Animal animal: animals){
            totalFood += animal.species().foodRequirementsInGramsPerDay();
        }
            return totalFood;
    }
}
