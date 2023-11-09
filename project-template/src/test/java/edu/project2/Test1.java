package edu.project2;

import edu.project1.Project1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class Test1 {
    @Test
    @DisplayName("Тест на генерацию и вывод лабиринта")
    void word_change(){
        Maze test1 = new Maze(10, 10, Maze.GeneratorType.PERFECT_GENERATOR),
            test2 = new Maze(15, 10, Maze.GeneratorType.PERFECT_GENERATOR),
            test3 = new Maze(30, 30, Maze.GeneratorType.PERFECT_GENERATOR);

        System.out.println(test1);
        System.out.println();
        
        System.out.println(test2);
        System.out.println();

        System.out.println(test3);
        System.out.println();


    }

}
