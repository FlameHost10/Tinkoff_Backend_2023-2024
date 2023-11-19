package edu.hw5;

import java.time.LocalDate;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private final static Pattern dateSeparatedDash = Pattern.compile("^(\\d{4})-(\\d{1,2})-(\\d{1,2})$");
    private final static Pattern dateSeparatedSlash = Pattern.compile("^(\\d{1,2})/(\\d{1,2})/(\\d{4})$");
    private final static Pattern dateSeparatedSlashAbbreviated = Pattern.compile("^(\\d{1,2})/(\\d{1,2})/(\\d{2})$");

    private final static Pattern fewDaysAgo = Pattern.compile("^(\\d+) day(s?) ago$");
    private final static Pattern fewDaysLater = Pattern.compile("^(\\d+) day(s?) later$");

    public static Optional<LocalDate> dateRecognition(String date){
        Matcher matchDateSeparatedDash = dateSeparatedDash.matcher(date);
        Matcher matchDateSeparatedSlash = dateSeparatedSlash.matcher(date);
        Matcher matchDateSeparatedSlashAbbreviated = dateSeparatedSlashAbbreviated.matcher(date);

        if(matchDateSeparatedDash.find()){
            return Optional.of(LocalDate.of(Integer.parseInt(matchDateSeparatedDash.group(1)),
                Integer.parseInt(matchDateSeparatedDash.group(2)),
                Integer.parseInt(matchDateSeparatedDash.group(3))));
        }
        else if(matchDateSeparatedSlash.find()){
            return Optional.of(LocalDate.of(Integer.parseInt(matchDateSeparatedSlash.group(3)),
                Integer.parseInt(matchDateSeparatedSlash.group(2)),
                Integer.parseInt(matchDateSeparatedSlash.group(1))));
        }
        else if(matchDateSeparatedSlashAbbreviated.find()){
            return Optional.of(LocalDate.of(Integer.parseInt(matchDateSeparatedSlashAbbreviated.group(3)) + 2000,
                Integer.parseInt(matchDateSeparatedSlashAbbreviated.group(2)),
                Integer.parseInt(matchDateSeparatedSlashAbbreviated.group(1))));
        }


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
