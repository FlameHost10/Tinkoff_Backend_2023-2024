package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw4.AnimalList.*;

public class Test4 {

    @Test
    @DisplayName("Животное с самым длинным именем")
    void MaxLenNameTest() {

        Animal maxLenName = Task4.MaxLenName(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }

        System.out.println();

        System.out.println(maxLenName);

    }
}
