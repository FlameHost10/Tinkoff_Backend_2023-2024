package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.AnimalList.getAnimals;

public class Test8 {

    @Test
    @DisplayName("Самое тяжелое животное ниже k см")
    void heaviestAnimalBelowFixedHeightTest() {

        Animal desiredAnimal = Task8.heaviestAnimalBelowFixedHeight(getAnimals(), 20);

        for(var animal: getAnimals()){
            System.out.println(animal);
        }


        System.out.println();

        System.out.println("heaviest animal is below 20 cm: " + desiredAnimal);

    }
}
