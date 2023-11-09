package edu.hw1;

public class Task5 {
    public static boolean isPalindromeDescendant(int numb){
        String correct_orientation = String.valueOf(numb);
        String reverse_orientation = new StringBuilder(correct_orientation).reverse().toString();
        int len_numb = correct_orientation.length();

        if(correct_orientation.equals(reverse_orientation)){
            return true;
        }
        else{
            int descendant = search_for_descendant(numb, len_numb);
            if(descendant == -1){
                return false;
            }
            return isPalindromeDescendant(descendant);
        }
    }
    public static int search_for_descendant(int numb, int len_numb){
        int[] arr_digit = new int[len_numb];
        for(int i = len_numb - 1; i > -1; i--) {
            arr_digit[i] = numb % 10;
            numb /= 10;
        }



        int descendant = 0;
        for(int i = 0; i < len_numb - len_numb % 2; i+= 2){
            int sum_neighbors = arr_digit[i] + arr_digit[i + 1];
            if(sum_neighbors < 10){
                descendant = descendant * 10 + sum_neighbors;
            }
            else{
                descendant = descendant * 100 + sum_neighbors;
            }
        }
        if (len_numb % 2 == 1){
            descendant = descendant * 10 + arr_digit[len_numb - 1];
        }

        if(descendant < 10){
            return -1;
        }
        return descendant;

    }
}
