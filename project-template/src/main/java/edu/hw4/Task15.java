package edu.hw4;

import java.util.HashMap;
import java.util.List;

import java.util.Map;

public class Task15 {
    public static Map<Animal.Type, Integer> weightFixedAgeAnimals(List<Animal> animals, int lowerBound, int upperBound){
        Map<Animal.Type, Integer> weightAnimalsMap = new HashMap<>();
        for(var animal:animals){
            if(animal.age() <= upperBound && animal.age() >= lowerBound && weightAnimalsMap.containsKey(animal.type())){
                weightAnimalsMap.put(animal.type(), weightAnimalsMap.get(animal.type()) + animal.weight());
            }
            else if (animal.age() <= upperBound && animal.age() >= lowerBound && !weightAnimalsMap.containsKey(animal.type())){
                weightAnimalsMap.put(animal.type(), animal.weight());
            }
        }
        return weightAnimalsMap;

    }
}
