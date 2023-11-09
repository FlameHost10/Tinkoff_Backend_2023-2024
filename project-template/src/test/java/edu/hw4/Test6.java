package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static edu.hw4.AnimalList.*;

public class Test6 {
    @Test
    @DisplayName("Самое тяжёлое животного каждого вида")
    void heaviestAnimalTypeTest() {

        Map<Animal.Type, Animal> heaviestAnimalTypeMap = Task6.heaviestAnimalType(getAnimals());

        for(var animal: getAnimals()){
            System.out.println(animal);
        }

        System.out.println();

        for(var animalKey: heaviestAnimalTypeMap.keySet()){
            System.out.println(animalKey + " -> " + heaviestAnimalTypeMap.get(animalKey));
        }
    }
}
