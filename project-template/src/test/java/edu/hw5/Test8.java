package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Stream;

public class Test8 {
    @Test
    @DisplayName("Дополнительное задание")
    public void additionalTaskTest(){
        List<String> tests = Stream.of("0", "11", "011", "0001", "111" , "1110", "01000110101", "1010001", "000101", "0001011", "", "13171").toList();


        for(var elem: tests){
            System.out.println(elem + " -> " + Task8.additionalTask(elem));
        }
    }
}
