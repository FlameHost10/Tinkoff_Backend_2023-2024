package edu.hw5;

import edu.hw3.Task7;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    @Test
    @DisplayName("Среднее значение продолжительности сеанса")
    void averageSessionTimeMinutesTest(){
        List<String> informationTimeTest1 = Stream.of("2022-03-12, 20:20 - 2022-03-12, 23:50", "2022-04-01, 21:30 - 2022-04-02, 01:20").
            toList();
        List<String> informationTimeTest2 = Stream.of("2021-03-12, 20:20 - 2022-03-12, 23:50", "2022-01-01, 21:30 - 2022-02-02, 01:20").
            toList();
        List<String> informationTimeTest3 = Stream.of("efe2422dd", "2022-04-01, 21:30 - 2022-04-02, 01:20").
            toList();

        List<String> informationTimeTest4 = Stream.of("2022-03-12, 23:20 - 2022-03-12, 23:25", "2022-04-01, 21:30 - 2022-04-01, 21:36")
            .toList();

        List<String> informationTimeTest5 = Stream.of("2022-03-12, 20:20 - 2022-03-12, 16:50", "2022-04-01, 21:30 - 2022-04-02, 01:20")
            .toList();

        double test1 = Task1.averageSessionTimeMinutes(informationTimeTest1);
        double test2 = Task1.averageSessionTimeMinutes(informationTimeTest2);
        double test3 = Task1.averageSessionTimeMinutes(informationTimeTest3);
        double test4 = Task1.averageSessionTimeMinutes(informationTimeTest4);
        double test5 = Task1.averageSessionTimeMinutes(informationTimeTest5);

        System.out.println((test1 == -1) ? "Incorrect data" : ((int) test1 / 60  + " : " + test1 % 60 ));
        System.out.println((test2 == -1) ? "Incorrect data" : ((int)test2 / 60  + " : " + test2 % 60 ));
        System.out.println((test3 == -1) ? "Incorrect data" : ((int)test3 / 60  + " : " + test3 % 60 ));
        System.out.println((test4 == -1) ? "Incorrect data" : ((int)test4 / 60  + " : " + test4 % 60 ));
        System.out.println((test5 == -1) ? "Incorrect data" : ((int)test5 / 60  + " : " + test5 % 60 ));

    }


}
