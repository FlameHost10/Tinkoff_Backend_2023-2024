package edu.hw6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;

public class Task4 {

    public static void streamComposition(String massage, Path path) throws IOException {
        File file = new File(path.toUri());

        FileOutputStream outputStream = new FileOutputStream(file);

        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(outputStream, new Adler32());

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(checkedOutputStream);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream, StandardCharsets.UTF_8);

        PrintWriter printWriter = new PrintWriter(outputStreamWriter);

        printWriter.write(massage);
        printWriter.close();

    }
}
