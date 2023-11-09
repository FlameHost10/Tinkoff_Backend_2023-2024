package edu.hw3;

public class Task1 {
    public static String atbash(String str){
        char[] arrayStr = str.toCharArray();
        for(int i = 0; i < arrayStr.length; i++){
            if(Character.isLowerCase(arrayStr[i])){
                arrayStr[i] = (char) (122 - ((int) (arrayStr[i]) - 97));
            }
            else if(Character.isUpperCase(arrayStr[i])){
                arrayStr[i] = (char) (90 - ((int) (arrayStr[i]) - 65));
            }
        }

        return String.valueOf(arrayStr);
    }
}
