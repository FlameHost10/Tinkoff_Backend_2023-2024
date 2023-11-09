package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test1 {

    @ParameterizedTest(name = "Длина видео в секундах")
    @ValueSource(strings = {"20:1", "10:23", "1232", "21:wefaa", "0:0", "11:60", "-12:10","20:-2"})
    void Determining_length_video(String s) {
        System.out.println(s + "\t->\t" + Task1.minutesToSeconds(s));
    }

}
