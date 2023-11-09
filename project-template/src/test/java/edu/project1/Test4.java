package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class Test4 {

    @Test
    @DisplayName("тест метода, который проверяет слово на наличие буквы (тест на проигрыш)")
    void guess_letter() throws IOException {
        String s = Project1.wordChange();
        Gallows gallows = new Gallows(s);
        for(int i = 0;i < 5; i++){
            gallows.guessLetter("z");
        }

    }
}
