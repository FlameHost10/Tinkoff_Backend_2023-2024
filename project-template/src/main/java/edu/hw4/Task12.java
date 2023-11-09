package edu.hw4;

import java.util.List;

public class Task12 {

    public static Integer weightMoreHeight(List<Animal> animals){
        int counter = 0;
        for(var animal:animals){
            if(animal.weight() > animal.height()){
                counter++;
            }
        }
        return counter;
    }
}
