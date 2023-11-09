package edu.hw4;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static List<Animal> bigAndBiting(List<Animal> animals){
        List<Animal> desiredAnimals = new ArrayList<>();
        for(var animal:animals){
            if(animal.height() > 100 && animal.bites()){
                desiredAnimals.add(animal);
            }
        }
        return desiredAnimals;
    }

}
