package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static edu.hw4.AnimalList.getAnimals;

public class Test14 {

    @Test
    @DisplayName("Есть ли собака ростом больше k см")
    void weightFixedAgeAnimalsTest() {

        boolean desiredAns = Task14.dogLargerFixedHeight(getAnimals(), 110);

        for(var animal: getAnimals()){
            System.out.println(animal);
        }


        System.out.println();

        System.out.println("Is there a dog in the list with a height of more than 110 cm: " + desiredAns);

    }
}
