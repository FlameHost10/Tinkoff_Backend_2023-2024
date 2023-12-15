package edu.hw7;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import static java.lang.Math.max;

public class Task2 {

    public static BigInteger factorialParallelStream(int numb){
        if(numb <= 0){
            return BigInteger.valueOf(-1);
        }
        if(numb == 1){
            return BigInteger.valueOf(1);
        }
        return IntStream.rangeClosed(2, numb).parallel().mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }

}
