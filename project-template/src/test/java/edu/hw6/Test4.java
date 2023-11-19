package edu.hw6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test4 {

    @Test
    @DisplayName("Композиция stream'ов ")
    void streamCompositionTest() throws IOException {
        Path path = Files.createFile(Paths.get("src/main/resources/hw6/Task4"));
        String massage = "some kind of message";

        Task4.streamComposition(massage, path);




    }

}
