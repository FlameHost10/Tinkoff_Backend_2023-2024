package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static edu.hw4.AnimalList.*;

public class Test7 {

    @Test
    @DisplayName("K-е самое старое животное")
    void oldestAnimalByNumberTest() {
        int numbFirst = 2, numbSecond = 6;


        Animal oldestAnimalByNumberFirst = Task7.oldestAnimalByNumber(getAnimals(), numbFirst);
        Animal oldestAnimalByNumberSecond = Task7.oldestAnimalByNumber(getAnimals(), numbSecond);

        for(var animal: getAnimals()){
            System.out.println(animal);
        }

        System.out.println();

        System.out.println(numbFirst + " -> " + oldestAnimalByNumberFirst);

        System.out.println(numbSecond + " -> " + oldestAnimalByNumberSecond);


    }
}
