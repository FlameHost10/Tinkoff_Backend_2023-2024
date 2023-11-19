package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static double averageSessionTimeMinutes(List<String> informationTime) {
        Pattern numbersTimePatter = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2}), (\\d{2}):(\\d{2}) - (\\d{4})-(\\d{2})-(\\d{2}), (\\d{2}):(\\d{2})$");
        double sumTime = 0;
        double numbSession = informationTime.size();


        for(var session:informationTime){
            Matcher matcher = numbersTimePatter.matcher(session);
            if(!matcher.find()){
                return -1;
            }
            LocalDateTime start = LocalDateTime.of(Integer.parseInt(matcher.group(1)),
                Integer.parseInt(matcher.group(2)),
                Integer.parseInt(matcher.group(3)),
                Integer.parseInt(matcher.group(4)),
                Integer.parseInt(matcher.group(5)));
            LocalDateTime end = LocalDateTime.of(Integer.parseInt(matcher.group(6)),
                Integer.parseInt(matcher.group(7)),
                Integer.parseInt(matcher.group(8)),
                Integer.parseInt(matcher.group(9)),
                Integer.parseInt(matcher.group(10)));
            if(start.isAfter(end)){
                return -1;
            }

            sumTime += Duration.between(start, end).toMinutes();
        }

        return sumTime / numbSession;
    }
}
