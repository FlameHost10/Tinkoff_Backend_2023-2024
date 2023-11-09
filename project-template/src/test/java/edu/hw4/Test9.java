package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static edu.hw4.AnimalList.getAnimals;

public class Test9 {

    @Test
    @DisplayName("Количество лап у животных")
    void pawCounterTest() {

        Integer numberPaws = Task9.pawCounter(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }

        System.out.println();

        System.out.println("number of paws: " + numberPaws);
    }
}
