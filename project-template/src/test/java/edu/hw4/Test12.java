package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.AnimalList.getAnimals;

public class Test12 {

    @Test
    @DisplayName("количество животных, у которых вес больше роста")
    void weightMoreHeightTest() {

        Integer NumberDesiredAnimals = Task12.weightMoreHeight(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }


        System.out.println();

        System.out.println("Number of desired animals: " + NumberDesiredAnimals);
    }
}
