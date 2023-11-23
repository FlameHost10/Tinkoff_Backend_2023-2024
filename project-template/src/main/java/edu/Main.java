package edu;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "2018-2i-01";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        System.out.println(LocalDate.parse(s, formatter));
    }
}
