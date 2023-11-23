package edu.hw7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    @DisplayName("Суммирование с помощью рахныъ потоков")
    void incrementFromThreadsTest() throws InterruptedException {

        int test1 = 50, test2 = 61;

        System.out.println();
        System.out.println("sum ->" + Task1.incrementFromThreads(test1));

        System.out.println();

        System.out.println();
        System.out.println("sum ->" + Task1.incrementFromThreads(test2));


    }


}
