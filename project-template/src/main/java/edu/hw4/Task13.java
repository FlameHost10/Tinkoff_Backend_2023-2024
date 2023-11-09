package edu.hw4;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    public static List<Animal> NameLongerTwo(List<Animal> animals){
        List<Animal> animalsNameLongerTwo = new ArrayList<>();
        for(var animal:animals){
            if(animal.name().split(" ").length > 1){
                animalsNameLongerTwo.add(animal);
            }
        }
        return animalsNameLongerTwo;
    }
}
