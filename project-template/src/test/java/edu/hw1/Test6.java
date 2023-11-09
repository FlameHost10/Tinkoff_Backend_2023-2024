package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test6 {
    @ParameterizedTest(name = "Поиск первого появления постоянной Капрекара")
    @ValueSource(ints = {6621, 6554, 1234, 6174, 1222})
    void constant_K(int numb) {
        System.out.println(numb + "\t->\t" + Task6.countK(numb));
    }
}
