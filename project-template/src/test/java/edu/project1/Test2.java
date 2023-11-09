package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class Test2 {
    @Test
    @DisplayName("тест метода, который проверяет слово на наличие буквы (тест на стоп-знак)")
    void guess_letter() throws IOException {
        Gallows gallows = new Gallows(Project1.wordChange());
        gallows.guessLetter("a");
        gallows.guessLetter("!");

    }
}
