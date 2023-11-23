package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test6 {
    @Test
    @DisplayName("Является ли подстрока частью основной строки")
    public void isStringSubsequenceTest(){
        String testMain1 = "achfdbaabgabcaabg", testSubsequence1 = "abc",
            testMain2 = "the best test", testSubsequence2 = "error",
            testMain3 = "", testSubsequence3 = "something",
            testMain4 = "the best test4", testSubsequence4 = "be4",
            testMain5 = "the best test4", testSubsequence5 = "",
            testMain6 = "the best test5", testSubsequence6 = "best the";


        System.out.println(testMain1 + "\t\t" + testSubsequence1 + " -> "+ Task6.isStringSubsequence(testMain1, testSubsequence1));
        System.out.println(testMain2 + "\t\t" + testSubsequence2 + " -> "+ Task6.isStringSubsequence(testMain2, testSubsequence2));
        System.out.println("[Empty string]" + "\t\t" + testSubsequence3 + " -> "+ Task6.isStringSubsequence(testMain3, testSubsequence3));
        System.out.println(testMain4 + "\t\t" + testSubsequence4 + " -> "+ Task6.isStringSubsequence(testMain4, testSubsequence4));
        System.out.println(testMain5 + "\t\t" + "[Empty string]" + " -> "+ Task6.isStringSubsequence(testMain5, testSubsequence5));
        System.out.println(testMain6 + "\t\t" + testSubsequence6 + " -> "+ Task6.isStringSubsequence(testMain6, testSubsequence6));

    }
}
