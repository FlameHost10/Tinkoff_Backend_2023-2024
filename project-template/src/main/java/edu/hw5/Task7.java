package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    private final static Pattern first = Pattern.compile("^([0,1]{2})0([0,1]*)$");
    private final static Pattern second = Pattern.compile("(?:(^0[0,1]*0$)|(^1[0,1]*1$)|(^[0,1]$))");
    private final static Pattern third = Pattern.compile("^[0,1]{1,3}$");

    public static String checkingForThreePatterns(String s){
        StringBuilder ans = new StringBuilder();

        Matcher matcherFirst = first.matcher(s);
        Matcher matcherSecond = second.matcher(s);
        Matcher matcherThird = third.matcher(s);


        if(matcherFirst.find()){
            ans.append("first pattern; ");
        }
        if(matcherSecond.find()){
            ans.append("second pattern; ");
        }
        if(matcherThird.find()){
            ans.append("third pattern; ");
        }
        return (ans.length() == 0)? "the string did not fit the wrong patterns" : ans.toString();
    }

}
