package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;


public class Test3 {

    @Test
    @DisplayName("распознование даты по строке")
    void dateRecognitionTest(){
        List<String> tests = Stream.of("2020-10-10", "2020-12-2","1/3/1976",
            "1/3/20","tomorrow","today","yesterday", "1 day ago","2234 days ago",
            "1 day later","5 days later", "wd13daee", "11111-2332-13341").toList();

        for(var date:tests){
            System.out.println(date + " -> " + Task3.dateRecognition(date).map(LocalDate::toString).orElse("no Date"));
        }

    }
}
