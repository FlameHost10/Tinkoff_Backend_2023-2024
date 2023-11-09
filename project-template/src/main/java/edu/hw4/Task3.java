package edu.hw4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {

    public static Map<Animal.Type, Integer> AnimalTypeCounter(List<Animal> animals){
        Map<Animal.Type, Integer> AnimalTypeMap = new HashMap<>();
        for(var animal:animals){
            AnimalTypeMap.put(animal.type(), (AnimalTypeMap.containsKey(animal.type()) ? AnimalTypeMap.get(animal.type()) + 1 : 1 ));
        }
        return AnimalTypeMap;
    }

}

