package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test3 {
    @Test
    @DisplayName("Проверка на возможность вложенности массива")
    void Determining_number_digits_in_number() {
        int[][][] tests = {
            {{1, 2, 3, 4}, {0, 6}},
            {{3, 1}, {4, 0}},
            {{9, 9, 8}, {8, 9}},
            {{1, 2, 3, 4}, {2, 3}},
            {{}, {}},
            {{}, {1, 2}}
        };

        for(var test:tests){
            System.out.println(toString(test[0]) + ", " + toString(test[1]) + "\t->\t" + Task3.isNestable(test[0], test[1]));
        }
    }
    private static String toString(int[] arr){
        if(arr.length == 0){
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < arr.length - 1; i++){
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length - 1]).append("]");
        return sb.toString();
    }
}
