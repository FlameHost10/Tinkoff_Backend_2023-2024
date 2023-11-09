package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.AnimalList.getAnimals;

public class Test11 {

    @Test
    @DisplayName("животные, которые больше 100 см и кусаются")
    void bigAndBitingTest() {

        List<Animal> desiredAnimals = Task11.bigAndBiting(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }

        System.out.println();

        for(var animal: desiredAnimals){
            System.out.println(animal);
        }
    }


}
