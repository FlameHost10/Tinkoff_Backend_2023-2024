package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.AnimalList.getAnimals;

public class Test17 {

    @Test
    @DisplayName("Пауки кусаются чаще, чем собаки?")
    void areSpidersMoreBitingThanDogsTest() {

        boolean desiredAns = Task17.areSpidersMoreBitingThanDogs(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }


        System.out.println();

        System.out.println("Do spiders bite more often than dogs? " + desiredAns);

    }

}
