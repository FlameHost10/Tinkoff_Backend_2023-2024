package edu.hw1;

public class Task2 {
    public static int countDigits(int numb){
        if(numb == 0){
            return 1;
        }
        int ans = 0;
        while (numb > 0){
            numb /= 10;
            ans++;
        }
        return ans;


    }
}
