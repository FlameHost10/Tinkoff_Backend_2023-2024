package edu.hw7;

public class Task1 {


    private static volatile int numberThreads = 0;
    public static int incrementFromThreads(int numb) throws InterruptedException {
        numberThreads = 0;

        Thread first = new Thread(() -> increment((numb / 2) + (numb % 2), "First"));
        Thread second = new Thread(() -> increment((numb / 2), "Second"));

        first.start();
        second.start();

        first.join();
        second.join();

        return numberThreads;

    }


    private static void increment(int quantity, String massage){
        for(int i = 0; i < quantity; i++){
            synchronized (Task1.class){
                numberThreads++;
                System.out.print(massage + " ");
            }
        }
    }

}
