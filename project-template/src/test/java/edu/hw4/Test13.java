package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.AnimalList.getAnimals;

public class Test13 {
    @Test
    @DisplayName("Список животных, имена которых состоят из более чем двух слов")
    void NameLongerTwoTest() {

        List<Animal> desiredAnimals = Task13.NameLongerTwo(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }


        System.out.println();

        for(var animal: desiredAnimals){
            System.out.println(animal);
        }

    }

}
