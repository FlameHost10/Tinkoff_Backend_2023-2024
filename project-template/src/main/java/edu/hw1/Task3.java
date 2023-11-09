package edu.hw1;

import java.util.Arrays;
import static java.lang.Math.min;

public class Task3 {

    public static boolean isNestable(int[] first_arr, int[] second_arr){
        if(first_arr.length == 0 || second_arr.length == 0){
            return false;
        }

        int min_value_first = Arrays.stream(first_arr).min().getAsInt(),
        min_value_second = Arrays.stream(second_arr).min().getAsInt(),
        max_value_first = Arrays.stream(first_arr).max().getAsInt(),
        max_value_second = Arrays.stream(second_arr).max().getAsInt();

        if(min_value_first > min_value_second && max_value_first < max_value_second){
            return true;
        }
        return false;
    }
    private static int minValue(int[] arr){
        int min = arr[0];
        for(var elem: arr){
            min = Math.min(elem, min);
        }
        return min;
    }

    private static int maxValue(int[] arr){
        int max = arr[0];
        for(var elem: arr){
            max = Math.max(elem, max);
        }
        return max;
    }

}
