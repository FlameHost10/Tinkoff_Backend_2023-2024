package edu.hw4;

import org.jetbrains.annotations.NotNull;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static List<Animal> sortHeight(List<Animal> animals){
        animals.sort(new MyComparator());
        return animals;
    }

    public static class MyComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            if(o1.height() == o2.height()){
                return 0;
            }
            else if(o1.height() > o2.height()){
                return 1;
            }
            return -1;
        }
    }

}
