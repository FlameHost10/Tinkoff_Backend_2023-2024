package edu.hw4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task19 {

    public static Map<String, Set<ValidationError>> animalErrorsDirty(List<Animal> animals){
        Map<String, Set<ValidationError>> animalErrorsMap = new HashMap<>();
        for(var animal:animals){
            animalErrorsMap.put(animal.name(), ValidationError.findErrors(animal));
        }

        return animalErrorsMap;
    }

    static class ValidationError{
        private String errorMassage;

        public ValidationError(ErrorType error){
            this.errorMassage = error.massage;
        }

        public static Set<ValidationError> findErrors(Animal animal){
            Set<ValidationError> validationErrorSet = new HashSet<>();


            //checking errors for non-positivity of data
            if(animal.weight() <= 0){
                validationErrorSet.add(new ValidationError(ErrorType.NOT_POSITIVE_WEIGHT));
            }

            if(animal.age() < 0){
                validationErrorSet.add(new ValidationError(ErrorType.NOT_POSITIVE_AGE));
            }

            if(animal.height() < 0){
                validationErrorSet.add(new ValidationError(ErrorType.NOT_POSITIVE_HEIGHT));
            }

            //checking errors for grate of data (the information is taken from the Internet)

            if(animal.type() == Animal.Type.DOG){
                if(animal.age() > 30){ //the maximum lifetime of a dog is 30 years
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_AGE));
                }
                if(animal.weight() > 155000){ //the maximum weight of a dog is 155000 gram
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_WEIGHT));
                }
                if(animal.height() > 112){ //the maximum height of a dog is 112 centimetre
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_HEIGHT));
                }
            }
            else if(animal.type() == Animal.Type.CAT){
                if(animal.age() > 38){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_AGE));
                }
                if(animal.weight() > 14000){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_WEIGHT));
                }
                if(animal.height() > 120){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_HEIGHT));
                }

            }
            else if(animal.type() == Animal.Type.SPIDER){
                if(animal.age() > 43){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_AGE));
                }
                if(animal.weight() > 170){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_WEIGHT));
                }
                if(animal.height() > 10){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_HEIGHT));
                }

            }
            else if(animal.type() == Animal.Type.FISH){
                if(animal.age() > 512){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_AGE));
                }
                if(animal.weight() > 21000000){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_WEIGHT));
                }
                if(animal.height() > 2500){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_HEIGHT));
                }

            }
            else if(animal.type() == Animal.Type.BIRD){
                if(animal.age() > 80){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_AGE));
                }
                if(animal.weight() > 220000){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_WEIGHT));
                }
                if(animal.height() > 3000){
                    validationErrorSet.add(new ValidationError(ErrorType.GRATE_HEIGHT));
                }

            }

            //checking errors for extra icons in the name

            for(var elem:animal.name().toCharArray()){
                if(!((elem <= 'z' && elem >= 'a') || (elem <= 'Z' && elem >= 'A') || elem == ' ')){
                    validationErrorSet.add(new ValidationError(ErrorType.INVALID_NAME));
                    break;
                }
            }

            return validationErrorSet;
        }

        @Override public String toString() {
            return "ValidationError{" +
                "errorName='" + errorMassage + '\'' +
                '}';
        }

        public String getErrorMassage() {
            return errorMassage;
        }

    }

    private enum ErrorType{
        NOT_POSITIVE_WEIGHT("not positive weight"),
        NOT_POSITIVE_AGE("not positive age"),
        NOT_POSITIVE_HEIGHT("not positive height"),
        GRATE_WEIGHT("grate weight"),
        GRATE_AGE("grate age"),
        GRATE_HEIGHT("grate height"),
        INVALID_NAME("Extra icons in the name");

        private final String massage;
        ErrorType(String massage){
            this.massage = massage;
        }


        public String getMassage(){ return massage;}
    }
}
