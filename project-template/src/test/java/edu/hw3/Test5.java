package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test5 {
    @Test
    @DisplayName("Список контактов")
    void contacts(){
        String[][] tests = new String[4][];
        tests[0] = new String[]{"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"};
        tests[1] = new String[0];
        tests[2] = null;
        tests[3] = new String[]{"Paul Erdos", "Leonhard Euler", "Carl Gauss"};

        for(int i = 0; i < 4; i++){
            String[] namesSorted = Task5.parseContacts(tests[i], "DESC");
            System.out.println(toString(namesSorted));
        }

        for(int i = 0; i < 4; i++){
            String[] namesSorted = Task5.parseContacts(tests[i], "ASC");

            System.out.println(toString(namesSorted));
        }
    }
    private static String toString(String[] arr){
        if(arr == null || arr.length == 0){
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < arr.length - 1; i++){
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length - 1]).append("]");
        return sb.toString();
    }
}
