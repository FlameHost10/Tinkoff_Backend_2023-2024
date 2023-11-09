package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test4 {
    @ParameterizedTest(name = "Исправление строки")
    @ValueSource(strings = {"12345", "hTsii  s aimex dpus rtni.g", "badce", "iSpmelt set"})
    void correcting_incorrect_string(String s) {
        System.out.println(s + "\t->\t" + Task4.fixString(s));
    }

}
