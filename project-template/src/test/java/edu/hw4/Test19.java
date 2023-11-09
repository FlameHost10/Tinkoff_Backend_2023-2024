package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Test19 {

    public final static ArrayList<Animal> animals = new ArrayList<>(){{
        add(new Animal("Bob", Animal.Type.CAT, Animal.Sex.M, 2, 30, 3000, false));
        add(new Animal("T9Qw~", Animal.Type.DOG, Animal.Sex.F, -5, 50, 5000, true));
        add(new Animal("Tod M", Animal.Type.FISH, Animal.Sex.M, 700, 10, 1000, false));
        add(new Animal("Molly", Animal.Type.BIRD, Animal.Sex.F, 3, 123456, -3000, false));
    }};


    @Test
    @DisplayName("Поиск ошибок у животных (dirty)")
    void animalErrorsDirtyTest() {

        Map<String, Set<Task19.ValidationError>> animalErrorMap = Task19.animalErrorsDirty(animals);

        for(var animal:animals){
            System.out.println(animal);
        }

        System.out.println();


        for(var nameAnimal:animalErrorMap.keySet()){
            System.out.println(nameAnimal + " -> " + animalErrorMap.get(nameAnimal));
        }

    }

}
