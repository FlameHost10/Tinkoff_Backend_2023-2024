package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class Test8 {
    @Test
    @DisplayName("Обратный итератр")
    void BackwardIteratorTest(){
        List<String> test1 = new ArrayList<>(), test2 = new ArrayList<>();
        test1.add("I");
        test1.add("am");

        Task8.BackwardIterator<String> backwardIteratorFirst = new Task8.BackwardIterator<>(test1);
        System.out.println(test1 + ": ");
        while (backwardIteratorFirst.hasNext()) {
            System.out.println(backwardIteratorFirst.next());
        }

        System.out.println("===================");


        Task8.BackwardIterator<String> backwardIteratorSecond = new Task8.BackwardIterator<>(test2);
        System.out.print(test2 + ": ");
        while (backwardIteratorSecond.hasNext()) {
            System.out.println(backwardIteratorSecond.next());
        }

    }

}
