package edu.project2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test2 {

    @Test
    @DisplayName("Тест на генерацию решения и его вывод")
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

        test1.setDecision(Solver.solver(test1));
        test2.setDecision(Solver.solver(test2));
        test3.setDecision(Solver.solver(test3));

        System.out.println(test1.toStringWithDecision());
        System.out.println();

        System.out.println(test2.toStringWithDecision());
        System.out.println();

        System.out.println(test3.toStringWithDecision());
        System.out.println();


    }
}
