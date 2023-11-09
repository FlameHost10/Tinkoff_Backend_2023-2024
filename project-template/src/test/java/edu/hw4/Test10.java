package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.AnimalList.getAnimals;

public class Test10 {

    @Test
    @DisplayName("животные, у которых количество лап != возраст")
    void ageNotEqualNumberPawsTest() {

        List<Animal> desiredAnimals = Task10.ageNotEqualNumberPaws(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }

        System.out.println();

        for(var animal: desiredAnimals){
            System.out.println(animal);
        }
    }
}
