package edu.hw5;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private final static DateTimeFormatter dateSeparatedDash = DateTimeFormatter.ofPattern("yyyy-M-d");
    private final static DateTimeFormatter dateSeparatedSlash = DateTimeFormatter.ofPattern("d/M/yyyy");
    private final static DateTimeFormatter dateSeparatedSlashAbbreviated = DateTimeFormatter.ofPattern("d/M/yy");

    private final static Pattern fewDaysAgo = Pattern.compile("^(\\d+) day(s?) ago$");
    private final static Pattern fewDaysLater = Pattern.compile("^(\\d+) day(s?) later$");

    public static Optional<LocalDate> dateRecognition(String date){
        try{
            return Optional.of(LocalDate.parse(date, dateSeparatedDash));
        }catch( DateTimeParseException ignored){}

        try{
            return Optional.of(LocalDate.parse(date, dateSeparatedSlash));
        }catch( DateTimeParseException ignored){}

        try{
            return Optional.of(LocalDate.parse(date, dateSeparatedSlashAbbreviated));
        }catch( DateTimeParseException ignored){}


        LocalDate now = LocalDate.now();
        Matcher matchFewDaysAgo= fewDaysAgo.matcher(date);
        Matcher matchFewDaysLater = fewDaysLater.matcher(date);

        if(matchFewDaysLater.find()){
            return Optional.of(now.plusDays(Integer.parseInt(matchFewDaysLater.group(1))));
        }
        else if(matchFewDaysAgo.find()){
            return Optional.of(now.minusDays(Integer.parseInt(matchFewDaysAgo.group(1))));
        }


        return switch (date){
            case "tomorrow" -> Optional.of(now.plusDays(1));
            case "today" -> Optional.of(now);
            case "yesterday" -> Optional.of(now.minusDays(1));
            default -> Optional.empty();
        };

    }

}
