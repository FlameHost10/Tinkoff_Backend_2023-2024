package edu.hw7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import static java.lang.Math.min;

public class Task1 {


    private static AtomicInteger numberThreads;
    public static int incrementFromThreads(int numb) throws InterruptedException {
        numberThreads = new AtomicInteger(0);


        List<Thread> threads = new ArrayList<>();;

        if(numb <= 100) {
            for (int i = 0; i < numb % 100; i++) {
                int finalI = i;
                threads.add(new Thread(() -> increment(numb / 100 + 1, String.valueOf(finalI))));
            }
        }
        else {
            for (int i = 0; i < numb % 100; i++) {
                int finalI = i;
                threads.add(new Thread(() -> increment(numb / 100 + 1, String.valueOf(finalI))));
            }

            for(int i = 0; i < 100 - numb % 100; i++){
                int finalI = i + numb % 100;
                threads.add(new Thread(() -> increment(numb / 100 ,  String.valueOf(finalI))));
            }
        }

        for(var t: threads){
            t.start();
        }

        for(var t: threads){
            t.join();
        }


        return numberThreads.get();

    }


    private static void increment(int quantity, String massage){
        for(int i = 0; i < quantity; i++){
            numberThreads.incrementAndGet();
            System.out.println("Thread: " + massage);
        }
    }

}
