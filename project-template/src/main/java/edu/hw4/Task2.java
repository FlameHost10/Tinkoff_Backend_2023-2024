package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static List<Animal> sortWeight(List<Animal> animals){
        animals.sort(new MyComparator());
        return animals;
    }

    public static class MyComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            if(o1.weight() == o2.weight()){
                return 0;
            }
            else if(o1.weight() > o2.weight()){
                return -1;
            }
            return 1;
        }
    }
}
