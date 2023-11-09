package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw4.AnimalList.*;

public class Test5 {
    @Test
    @DisplayName("Сравнение количества самцов и самок")
    void maleFemaleTest() {

        Animal.Sex maleFemale = Task5.maleFemale(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }

        System.out.println();

        System.out.println(maleFemale);
    }
}
