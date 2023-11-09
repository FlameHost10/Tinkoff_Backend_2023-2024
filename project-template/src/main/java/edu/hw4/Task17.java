package edu.hw4;

import java.util.List;

public class Task17 {
    public static boolean areSpidersMoreBitingThanDogs(List<Animal> animals){
        float numberBitingSpiders = 0, numberBitingDogs = 0;
        float numberSpiders = 0, numberDogs = 0;
        for(var animal:animals){
            if(animal.type() == Animal.Type.DOG && animal.bites()){
                numberBitingDogs++;
                numberDogs++;
            }
            else if (animal.type() == Animal.Type.DOG){
                numberDogs++;
            }
            else if(animal.type() == Animal.Type.SPIDER && animal.bites()){
                numberBitingSpiders++;
                numberSpiders++;
            }
            else if (animal.type() == Animal.Type.SPIDER){
                numberSpiders++;
            }
        }

        if(numberSpiders == 0 || numberDogs == 0){
            return false;
        }
        return (numberBitingSpiders / numberSpiders) > (numberBitingDogs / numberDogs);
    }
}
