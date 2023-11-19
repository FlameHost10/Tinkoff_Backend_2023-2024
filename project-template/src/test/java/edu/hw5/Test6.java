package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test6 {
    @Test
    @DisplayName("Является ли подстрока частью основной строки")
    public void isStringSubsequenceTest(){
        String testMain1 = "achfdbaabgabcaabg", testSubsequence1 = "abc",
            testMain2 = "the best test", testSubsequence2 = "error",
            testMain3 = "", testSubsequence3 = "something";

        System.out.println(testMain1 + "\t\t" + testSubsequence1 + " -> "+ Task6.isStringSubsequence(testMain1, testSubsequence1));
        System.out.println(testMain2 + "\t\t" + testSubsequence2 + " -> "+ Task6.isStringSubsequence(testMain2, testSubsequence2));
        System.out.println("[Empty string]" + "\t\t" + testSubsequence3 + " -> "+ Task6.isStringSubsequence(testMain3, testSubsequence3));

    }
}
