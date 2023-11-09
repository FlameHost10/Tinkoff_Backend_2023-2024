package edu.hw3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {
    public static String convertToRoman(int numb){
        if(numb == 0){
            return "nulla";
        }

        if(numb < 0){
            return "incorrect data";
        }

        return convertToRomanCorrectData(numb);


    }

    public static String convertToRomanCorrectData(int numb){
        initializationMap();
        StringBuilder romanNumb = new StringBuilder();
        for(int key:possiblePartsNumber.keySet()){
            while(numb >= key){
                romanNumb.append(possiblePartsNumber.get(key));
                numb -= key;
            }
        }
        return romanNumb.toString();
    }

    private static Map<Integer, String> possiblePartsNumber = new LinkedHashMap<>();
    private static void initializationMap(){
        possiblePartsNumber.put(1000, "M");
        possiblePartsNumber.put(900, "CM");
        possiblePartsNumber.put(500, "D");
        possiblePartsNumber.put(400, "CD");
        possiblePartsNumber.put(100, "C");
        possiblePartsNumber.put(90, "XC");
        possiblePartsNumber.put(50, "L");
        possiblePartsNumber.put(40, "XL");
        possiblePartsNumber.put(10, "X");
        possiblePartsNumber.put(9, "IX");
        possiblePartsNumber.put(5, "V");
        possiblePartsNumber.put(4, "IV");
        possiblePartsNumber.put(1, "I");
    }

}
