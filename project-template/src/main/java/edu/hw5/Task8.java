package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    private final static Pattern oddLength = Pattern.compile("^([0,1]{2})*[0,1]$");
    private final static Pattern complicatedLengthParity = Pattern.compile("(?:(^0(([0,1]{2})*)$)|(^1(([0,1]{2})*)[0,1]$))");
    private final static Pattern noConsecutiveOne = Pattern.compile("^(?!.*11)[0,1]*$");
    private final static Pattern oddOne = Pattern.compile("^(1[0,1])*(1?)$");


    public static String additionalTask(String s){
        StringBuilder ans = new StringBuilder();

        Matcher matcherOddLength = oddLength.matcher(s);
        Matcher matcherComplicatedLengthParity = complicatedLengthParity.matcher(s);
        Matcher matcherNoConsecutiveOne = noConsecutiveOne.matcher(s);
        Matcher matcherOddOne= oddOne.matcher(s);


        if(matcherOddLength.find()){
            ans.append("odd length; ");
        }
        if(matcherComplicatedLengthParity.find()){
            ans.append("complicated length parity; ");
        }
        if(matcherNoConsecutiveOne.find()){
            ans.append("no consecutive one; ");
        }
        if(matcherOddOne.find()){
            ans.append("odd one; ");
        }
        return (ans.length() == 0)? "the string did not fit the wrong patterns" : ans.toString();
    }

}
