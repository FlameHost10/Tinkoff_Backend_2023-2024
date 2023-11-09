package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class Test5 {
    @Test
    @DisplayName("тест метода, который проверяет слово на наличие буквы (тест на некорректные данные)")
    void guess_letter() throws IOException {
        String s = Project1.wordChange();
        Gallows gallows = new Gallows(s);
        gallows.guessLetter("");
        gallows.guessLetter("4");
        gallows.guessLetter("fw4fw");

    }
}
