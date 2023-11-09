package edu.hw3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test2 {
    @ParameterizedTest(name = "Кластеризация скобок")
    @ValueSource(strings = {"()()()", "((()))", "((())())(()(()()))", "", "((((()", "adfe72f2ih"})
    void clusterizeTest(String s) {
        System.out.print(s + "\t->\t");
        for(var elem: Task2.clusterize(s)){
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
