package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static double averageSessionTimeMinutes(List<String> informationTime) {
        Pattern numbersTimePatter = Pattern.compile("^(\\d{4}-\\d{2}-\\d{2}, \\d{2}:\\d{2}) - (\\d{4}-\\d{2}-\\d{2}, \\d{2}:\\d{2})$");
        double sumTime = 0;
        double numbSession = informationTime.size();


        for(var session:informationTime){
            Matcher matcher = numbersTimePatter.matcher(session);
            if(!matcher.find()){
                return -1;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");

            LocalDateTime start = LocalDateTime.parse(matcher.group(1), formatter);
            LocalDateTime end = LocalDateTime.parse(matcher.group(2), formatter);

            if(start.isAfter(end)){
                return -1;
            }

            sumTime += Duration.between(start, end).toMinutes();
        }

        return sumTime / numbSession;
    }
}
