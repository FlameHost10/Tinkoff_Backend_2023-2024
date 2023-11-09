package edu.hw1;

public class Task1 {
    public static int minutesToSeconds(String time){
        String[] numbers = time.split(":");

        if(numbers.length != 2){
            return -1;
        }
        int minutes, second;

        try {
            minutes = Integer.parseInt(numbers[0]);
            second = Integer.parseInt(numbers[1]);
        } catch (NumberFormatException e){
            return -1;
        }

        if(minutes < 0 || second < 0 || second >= 60){
            return -1;
        }
        return minutes * 60 + second;

    }
}
