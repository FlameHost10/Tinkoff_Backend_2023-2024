package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test2 {


    @ParameterizedTest(name = "Количество цифр в числе")
    @ValueSource(ints = {0, 3, 10, 23, 1422, 123456})
    void Determining_number_digits_in_number(int numb) {
        System.out.println(numb + "\t->\t" + Task2.countDigits(numb));
    }
}
