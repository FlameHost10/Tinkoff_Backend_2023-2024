package edu.hw3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test1 {
    @ParameterizedTest(name = "Шифр Атбаш")
    @ValueSource(strings = {"abcd", "AbcD", "jsaOAld", "sd82jdKAd8sw"})
    void atbushTest(String s) {
        System.out.println(s + "\t->\t" + Task1.atbash(s));
    }
}
