package edu.hw4;

import java.util.List;

public class Task18 {
    @SafeVarargs public static Animal heaviestFish(List<Animal> ... listsAnimals){
        Animal heaviestFish = null;
        float weightHeaviestFish = 0;
        for(var listAnimals:listsAnimals){
            for(var animal:listAnimals){
                if(animal.type() == Animal.Type.FISH && animal.weight() > weightHeaviestFish){
                    weightHeaviestFish = animal.weight();
                    heaviestFish = animal;
                }
            }
        }
        return heaviestFish;
    }
}
