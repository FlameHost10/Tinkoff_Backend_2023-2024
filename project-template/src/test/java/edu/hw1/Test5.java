package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test5 {

    @ParameterizedTest(name = "проверка палиндрома")
    @ValueSource(ints = {5, 11211230, 13001120, 1123, 11, 23336014})
    void checking_special_palindrome(int numb) {
        System.out.println(numb + "\t->\t" + Task5.isPalindromeDescendant(numb));
    }
}
