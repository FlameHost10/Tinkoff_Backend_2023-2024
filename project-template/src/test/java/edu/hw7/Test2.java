package edu.hw7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test2 {

    @Test
    @DisplayName("Факториал с parallelStream")
    void factorialParallelStreamTest() throws InterruptedException {
        int test1 = 5, test2 = 20, test3 = 200;

        System.out.println(Task2.factorialParallelStream(test1));
        System.out.println(Task2.factorialParallelStream(test2));
        System.out.println(Task2.factorialParallelStream(test3));
    }



}
