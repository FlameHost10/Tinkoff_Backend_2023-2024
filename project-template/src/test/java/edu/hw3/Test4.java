package edu.hw3;

import edu.hw1.Task1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test4 {

    @ParameterizedTest(name = "Конвертация чисел в Римские числа")
    @ValueSource(ints = {1, 0, 99, 5000, 12, 32311, -23, -1133})
    void convertToRomanTest(Integer numb) {
        System.out.println(numb + "\t->\t" + Task4.convertToRoman(numb));
    }
}

