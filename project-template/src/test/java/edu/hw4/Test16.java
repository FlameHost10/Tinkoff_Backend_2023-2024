package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.AnimalList.getAnimals;

public class Test16 {

    @Test
    @DisplayName("Список животных, отсортированный по виду, затем по полу, затем по имени")
    void sortTypeGenderNameTest() {

        List<Animal> desiredAnimals = Task16.sortTypeGenderName(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }


        System.out.println();

        for(var animal: desiredAnimals){
            System.out.println(animal);
        }

    }

}
