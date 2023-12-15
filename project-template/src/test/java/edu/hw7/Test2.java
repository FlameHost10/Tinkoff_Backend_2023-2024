package edu.hw7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import java.util.List;

public class Test2 {

    @Test
    @DisplayName("Факториал с parallelStream")
    void factorialParallelStreamTest() {
        List<Integer> tests = List.of(1, 20, 200, -20);

        for(var test: tests) {
            System.out.println(test);
            if(test <= 0){
                System.out.println("Invalid test");
                continue;
            }

            BigInteger ansFunction = Task2.factorialParallelStream(test);
            BigInteger ansLoop = BigInteger.ONE;

            for(long i = 1; i < test + 1; i++){
                ansLoop = ansLoop.multiply(BigInteger.valueOf(i));
            }
            System.out.println("ans function: " + ansFunction);
            System.out.println("ans loop: " + ansLoop);
            if(ansLoop.equals(ansFunction)){
                System.out.println("the answers are equal");
            }
            else{
                System.out.println("the answers are not equal");
            }

            System.out.println("=======================");
        }
    }



}
