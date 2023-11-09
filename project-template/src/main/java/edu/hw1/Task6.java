package edu.hw1;

import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    public static int countK(int numb){
        if(numb == 6174){
            return 0;
        }
        Integer[] arr_digit = new Integer[4];
        int count = 4;
        if(numb < 1000){
            arr_digit[3] = 0;
            count--;
        }
        for(int i = 0; i < count; i++){
            arr_digit[i] = numb % 10;
            numb /= 10;
        }
        Arrays.sort(arr_digit, Collections.reverseOrder());
        int decreasing_numb = 0, increasing = 0;

        for (int i = 0; i < 4; i++) {
            decreasing_numb = decreasing_numb * 10 + arr_digit[i];
            increasing += (i > 0) ?(int) Math.pow(10, i) * arr_digit[i] : arr_digit[i];
        }
        int difference = decreasing_numb - increasing;
        return 1 + countK(difference);

    }


}
