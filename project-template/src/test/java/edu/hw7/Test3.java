package edu.hw7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test3 {

    @Test
    @DisplayName("Поиск людей в database")
    void PersonDatabaseFindTest() throws InterruptedException {

        Task3.PersonDatabaseFind personDatabaseFind = new Task3.PersonDatabaseFind();

        Thread first = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchronized (this) {
                    System.out.println("add person " + i);
                    personDatabaseFind.add(new Task3.Person(i, "name " + i, "address " + i, "phone " + i));
                }
            }
        }
        );

        Thread second = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if(i % 3 == 0){
                    synchronized (this) {
                        System.out.println("Find name " + i);
                        System.out.println(personDatabaseFind.findByName("name " + i));

                    }
                }
                else if(i % 3 == 1){
                    synchronized (this) {
                        System.out.println("Find address " + i);
                        System.out.println(personDatabaseFind.findByAddress("address " + i));

                    }
                }
                else {
                    synchronized (this) {
                        System.out.println("Find phone " + i);
                        System.out.println(personDatabaseFind.findByPhone("phone " + i));

                    }
                }

            }
        }
        );

        Thread third = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchronized (this) {
                    System.out.println("delete person " + i);
                    personDatabaseFind.delete(i);

                }
            }
        }
        );


        first.start();
        second.start();
        third.start();

        first.join();
        second.join();
        third.join();



    }
}
