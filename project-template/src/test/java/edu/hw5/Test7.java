package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Stream;

public class Test7 {
    @Test
    @DisplayName("Проверка строки на 3 условия")
    public void checkingForThreePatternsTest(){
        List<String> tests = Stream.of("0", "1010", "1101011", "01000110101", "", "10", "13312").toList();


        for(var elem: tests){
            System.out.println(elem + " -> " + Task7.checkingForThreePatterns(elem));
        }
    }
}
