package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static edu.hw4.AnimalList.*;
public class Test3 {

    @Test
    @DisplayName("Количество животных каждого вида")
    void AnimalTypeCounterTest(){
        Map<Animal.Type, Integer> animalTypeMap = Task3.AnimalTypeCounter(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }

        System.out.println();

        for(var animal: animalTypeMap.keySet()){
            System.out.println(animal + " -> " + animalTypeMap.get(animal));
        }
    }
}

