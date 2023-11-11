package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static boolean isStringSubsequence(String mainString, String subsequence){
        Pattern subsequencePattern = Pattern.compile(subsequence);
        Matcher mainStringMatcher = subsequencePattern.matcher(mainString);
        return mainStringMatcher.find();
    }
}
