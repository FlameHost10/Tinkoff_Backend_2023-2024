package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.AnimalList.*;

public class Test2 {
    @Test
    @DisplayName("Сортировка по весу")
    void sortHeightTest(){

        List<Animal> animalsSort = Task2.sortWeight(getAnimals());

        for(var animal: animalsSort){
            System.out.println(animal);
        }

    }
}
