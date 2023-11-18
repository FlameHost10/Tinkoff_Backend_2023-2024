package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static boolean isStringSubsequence(String mainString, String subsequence){
        if(subsequence.length() == 0){
            return true;
        }

        int indexSubsequence = 0;
        for(var elem:mainString.toCharArray()){
            if(subsequence.charAt(indexSubsequence) == elem){
                indexSubsequence++;
                if(indexSubsequence == subsequence.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
