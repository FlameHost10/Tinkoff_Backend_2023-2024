package edu.hw5;

import java.util.regex.Pattern;

public class Task8 {
    private final static Pattern oddLength = Pattern.compile("^([0,1]{2})*[0,1]$");
    private final static Pattern complicatedLengthParity = Pattern.compile("(?:(^0(([0,1]{2})*)$)|(^1(([0,1]{2})*)[0,1]$))");
    private final static Pattern noConsecutiveOne = Pattern.compile("^(?!.*11)[0,1]*$");

}
