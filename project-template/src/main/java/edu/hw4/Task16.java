package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class Task16 {
    public static List<Animal> sortTypeGenderName(List<Animal> animals){
        animals.sort(new MyComparator());
        return animals;
    }
    public static class MyComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            int o1Type = typeDefinitions(o1.type()), o2Type = typeDefinitions(o2.type());
            if(o1Type != o2Type){
                return (o1Type > o2Type) ? -1 : 1;
            }
            int o1Sex = sexDefinitions(o1.sex()), o2Sex = sexDefinitions(o2.sex());

            if(o1Sex != o2Sex){
                return (o1Sex > o2Sex) ? -1 : 1;
            }
            return o1.name().compareTo(o2.name());
        }

        private int typeDefinitions(Animal.Type type){
            return switch (type){
                case DOG -> 4;
                case CAT -> 3;
                case BIRD -> 2;
                case FISH -> 1;
                case SPIDER -> 0;
            };
        }

        private int sexDefinitions(Animal.Sex sex){
            return switch (sex){
                case M -> 1;
                case F -> 0;
            };
        }

    }

}
