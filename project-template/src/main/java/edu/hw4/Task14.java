package edu.hw4;

import java.util.ArrayList;
import java.util.List;

public class Task14 {

    public static boolean dogLargerFixedHeight(List<Animal> animals, int heightComparison) {

        for (var animal : animals) {
            if (animal.type() == Animal.Type.DOG && animal.height() > heightComparison) {
                return true;
            }
        }
        return false;
    }
}
