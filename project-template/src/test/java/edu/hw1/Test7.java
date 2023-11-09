package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Test7 {
    @ParameterizedTest(name = "циклический сдвиг")
    @CsvSource(value = {"8, 1", "16, 1", "17, 2", "0, 2", "63, 3"})
    void constant_K(String s, int numb) {
        System.out.println("rotateRight\t{" + s + ", " + numb + "}\t->\t" + Task7.rotateRight(Integer.parseInt(s), numb));
        System.out.println("rotateLeft\t{" + s + ", " + numb + "}\t->\t" + Task7.rotateLeft(Integer.parseInt(s), numb));
        System.out.println();
    }
}
