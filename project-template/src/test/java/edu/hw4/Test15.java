package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static edu.hw4.AnimalList.getAnimals;

public class Test15 {

    @Test
    @DisplayName("суммарный вес животных каждого вида, которым от k до l лет")
    void weightFixedAgeAnimalsTest() {

        Map<Animal.Type, Integer> desiredAnimalsTypeMap = Task15.weightFixedAgeAnimals(getAnimals(), 3, 10);

        for(var animal: getAnimals()){
            System.out.println(animal);
        }


        System.out.println();

        System.out.println("lower bound 3 and upper bound 10");
        for(var type: desiredAnimalsTypeMap.keySet()){
            System.out.println(type + " -> " + desiredAnimalsTypeMap.get(type));
        }

    }

}
