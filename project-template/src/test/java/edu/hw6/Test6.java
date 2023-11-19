package edu.hw6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class Test6 {

    @Test
    @DisplayName("Анализ портов")
    void portAnalysisTest() {
        ArrayList<String[]> ans = Task6.portAnalysis();

        for(var elem:ans){
            System.out.println(elem[0] + " -> " + elem[1]);
        }
    }

}

