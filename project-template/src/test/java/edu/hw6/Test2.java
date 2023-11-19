package edu.hw6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {

    @Test
    @DisplayName("копирование файла")
    void cloneFileTest() throws IOException {

        Path pathTest1 = Paths.get("src/main/resources/hw6/Task2");
        Path pathTest2 = Paths.get("src/main/resources/hw6/Tas2");

        if(Task2.cloneFile(pathTest1)){
            System.out.println(pathTest1 + ": the file has been cloned");
        }
        else{
            System.out.println(pathTest1 + ":Invalid file address");
        }

        if(Task2.cloneFile(pathTest1)){
            System.out.println(pathTest1 + ": the file has been cloned");
        }
        else{
            System.out.println(pathTest1 + ": Invalid file address");
        }


        if(Task2.cloneFile(pathTest2)){
            System.out.println(pathTest2 + ": the file has been created");
        }
        else{
            System.out.println(pathTest2 + ": Invalid file address");
        }
    }
}
