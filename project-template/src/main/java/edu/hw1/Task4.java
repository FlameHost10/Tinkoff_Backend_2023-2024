package edu.hw1;

public class Task4 {
    public static String fixString(String broken_string){
        int len = broken_string.length();
        StringBuilder correct_string = new StringBuilder();
        for(int i = 0; i < len - len % 2; i+= 2){
            correct_string.append(broken_string.charAt(i + 1));
            correct_string.append(broken_string.charAt(i));
        }
        if(len % 2 == 1){
            correct_string.append(broken_string.charAt(len - 1));
        }
        return correct_string.toString();
    }
}
