package edu.hw3;

import java.util.Comparator;

public class Task7 {

    static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String left, String right) {
            if(left == null && right == null){
                return 0;
            }
            else if(left == null){
                return 1;
            }
            else if(right == null){
                return -1;
            }
            return left.compareTo(right);
        }
    }
}
