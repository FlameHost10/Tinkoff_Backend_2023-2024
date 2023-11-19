package edu.hw6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Task2 {

    public static boolean cloneFile(Path path) throws IOException {
        if(!Files.isRegularFile(path)){
            return false;
        }
        String pathParent = path.getParent().toString();
        String pathName = path.getFileName().toString();

        Path pathCopyFile = Path.of(pathParent, pathName + " - копия");

        int ind = 1;
        while(Files.isRegularFile(pathCopyFile)){
            pathCopyFile = Path.of(pathParent, pathName + " - копия (" + ind + ")");
            ind++;
        }


        Files.copy(path, pathCopyFile, StandardCopyOption.REPLACE_EXISTING);

        return true;

    }

}
