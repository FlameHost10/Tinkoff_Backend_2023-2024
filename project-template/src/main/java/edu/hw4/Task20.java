package edu.hw4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task20 {

    public static Map<String, String> animalErrorsClear(List<Animal> animals){
        Map<String, String> animalErrorsMap = new HashMap<>();
        for(var animal:animals){
            Set<Task19.ValidationError> validationErrorSet = Task19.ValidationError.findErrors(animal);
            StringBuilder errorMassage = new StringBuilder();
            for(var validationError:validationErrorSet){
                errorMassage.append(validationError.getErrorMassage());
                errorMassage.append(";\t");
            }

            if(errorMassage.isEmpty()){
                errorMassage.append("no errors;");
            }

            animalErrorsMap.put(animal.name(), errorMassage.toString());
        }

        return animalErrorsMap;
    }
}
