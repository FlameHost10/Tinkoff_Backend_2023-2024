package edu.hw4;

import java.util.List;

public class Task4 {
    public static Animal MaxLenName(List<Animal> animals){
        int maxNamb = animals.get(0).name().length();
        Animal maxAnimal = animals.get(0);
        for(var animal: animals){
            if(animal.name().length() > maxNamb){
                maxNamb = animal.name().length();
                maxAnimal = animal;
            }
        }
        return maxAnimal;
    }
}
