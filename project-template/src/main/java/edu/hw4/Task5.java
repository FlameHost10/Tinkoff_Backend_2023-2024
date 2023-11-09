package edu.hw4;

import java.util.List;

public class Task5 {

    public static Animal.Sex maleFemale(List<Animal> animals){
        int numbMale = 0, numbFemale = 0;
        for(var animal:animals){
            switch (animal.sex()){
                case F -> numbFemale++;
                case M -> numbMale++;
            }
        }
        return (numbMale > numbFemale) ? Animal.Sex.M : Animal.Sex.F;
    }
}
