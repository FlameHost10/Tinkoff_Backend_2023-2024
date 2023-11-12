package edu;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023, 11, 12);
        System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
    }
}
