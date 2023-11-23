package edu;

import edu.hw7.Task1;
import edu.hw7.Task2;
import java.math.BigInteger;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Task2.factorialParallelStream(1000));

    }
}
