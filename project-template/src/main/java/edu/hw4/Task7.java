package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class Task7 {
    public static Animal oldestAnimalByNumber(List<Animal> animals, int k){
        if(k > animals.size()){
            return null;
        }
        animals.sort(new MyComparator());
        return animals.get(k - 1);

    }

    public static class MyComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            if(o1.age() == o2.age()){
                return 0;
            }
            else if(o1.age() > o2.age()){
                return 1;
            }
            return -1;
        }
    }

}
