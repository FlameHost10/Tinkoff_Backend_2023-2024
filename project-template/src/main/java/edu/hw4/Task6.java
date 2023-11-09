package edu.hw4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6 {
    public static Map<Animal.Type, Animal> heaviestAnimalType(List<Animal> animals) {
        Map<Animal.Type, Animal> heaviestAnimalTypeMap = new HashMap<>();

        for (var animal : animals) {
            if (heaviestAnimalTypeMap.containsKey(animal.type())) {
                heaviestAnimalTypeMap.put(animal.type(),
                    (heaviestAnimalTypeMap.get(animal.type()).weight() < animal.weight()) ? animal :
                        heaviestAnimalTypeMap.get(animal.type())
                );
            } else {
                heaviestAnimalTypeMap.put(animal.type(), animal);
            }
        }

        return heaviestAnimalTypeMap;
    }

}
