package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test4 {

    @Test
    @DisplayName("Кто вызвал функцию?")
    void informationAboutMethod(){
        Task4.whoCalledMethod();
        methodForTest();
    }

    private void methodForTest(){
        Task4.whoCalledMethod();
    }
}
