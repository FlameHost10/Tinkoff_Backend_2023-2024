package edu.hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static String[] parseContacts(String[] names, String orientation){
        if(names == null || names.length == 0){
            return new String[0];
        }

        return parseContactsCorrectData(names, orientation);

    }

    private static String[] parseContactsCorrectData(String[] names, String orientation){
        List<String> nameSurname = new ArrayList<>(Arrays.asList(names));
        switch (orientation){
            case "DESC":
                Collections.sort(nameSurname, new MyComparatorRevers());
                break;
            default:
                Collections.sort(nameSurname, new MyComparator());

        }
        String[] namesSorted = new String[names.length];
        nameSurname.toArray(namesSorted);
        return namesSorted;

    }

    private static class MyComparator implements Comparator<String>{

        @Override
        public int compare(String left, String right) {
            String[] arrayLeft = left.split(" "), arrayRight = right.split(" ");
            String surnameNameLeft = arrayLeft[1] + arrayLeft[0], surnameNameRight = arrayRight[1] + arrayRight[0];
            return surnameNameLeft.compareTo(surnameNameRight);
        }
    }

    private static class MyComparatorRevers implements Comparator<String>{

        @Override
        public int compare(String left, String right) {
            String[] arrayLeft = left.split(" "), arrayRight = right.split(" ");
            String surnameNameLeft = arrayLeft[1] + arrayLeft[0], surnameNameRight = arrayRight[1] + arrayRight[0];
            return surnameNameRight.compareTo(surnameNameLeft);
        }
    }
}
