package edu.hw5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<LocalDate> searchFriday13th(int year){
        LocalDate checkedDate = LocalDate.of(year, 1, 13);
        LocalDate end = LocalDate.of(year, 12, 31);

        List<LocalDate> friday13th = new ArrayList<>();

        while(checkedDate.isBefore(end)){
            if(checkedDate.getDayOfWeek() == DayOfWeek.FRIDAY){
                friday13th.add(checkedDate);
            }
            checkedDate = checkedDate.plusMonths(1);
        }

        return friday13th;


    }

    public static LocalDate searchNextFriday13th(LocalDate date){
        LocalDate checkedDate = date;

        do{
            checkedDate = checkedDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        }while (checkedDate.getDayOfMonth() != 13);

        return checkedDate;
    }
}
