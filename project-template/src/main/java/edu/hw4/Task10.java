package edu.hw4;

import java.util.ArrayList;
import java.util.List;

public class Task10 {

    public static List<Animal> ageNotEqualNumberPaws(List<Animal> animals){
        List<Animal> desiredAnimals = new ArrayList<>();
        for(var animal:animals){
            int numbPaws = switch (animal.type()){
                case CAT, DOG -> 4;
                case BIRD -> 2;
                case FISH -> 0;
                case SPIDER -> 8;
            };
            if(numbPaws != animal.age()){
                desiredAnimals.add(animal);
            }
        }
        return desiredAnimals;
    }
}
