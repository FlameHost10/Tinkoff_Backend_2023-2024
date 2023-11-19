package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Test2 {

    @Test
    @DisplayName("Среднее значение продолжительности сеанса")
    void searchFriday13thTest(){
        List<LocalDate> test1 = Task2.searchFriday13th(1925);
        List<LocalDate> test2 = Task2.searchFriday13th(2024);
        List<LocalDate> test3 = Task2.searchFriday13th(2023);

        for(var elem:test1){
            System.out.println(elem);
        }
        System.out.println();
        for(var elem:test2){
            System.out.println(elem);
        }
        System.out.println();
        for(var elem:test3){
            System.out.println(elem);
        }


        System.out.println("===========");
        LocalDate test4 = LocalDate.of(1925, 2, 13);
        LocalDate test5 = LocalDate.of(2024, 9, 13);
        LocalDate test6 = LocalDate.now();


        System.out.println(test4 + " -> " + Task2.searchNextFriday13th(test4));
        System.out.println(test5 + " -> " + Task2.searchNextFriday13th(test5));
        System.out.println(test6 + " -> " + Task2.searchNextFriday13th(test6));

    }
}
