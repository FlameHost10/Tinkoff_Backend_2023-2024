package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.AnimalList.*;

public class Test1 {
    @Test
    @DisplayName("Сортировка по росту")
    void sortHeightTest(){

        List<Animal> animalsSort = Task1.sortHeight(getAnimals());

        for(var animal: animalsSort){
            System.out.println(animal);
        }

    }
}
