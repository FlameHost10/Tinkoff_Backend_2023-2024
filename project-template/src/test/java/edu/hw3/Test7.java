package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.TreeMap;
import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class Test7 {
    @Test
    @DisplayName("TreeMap с null-ключами")
    void treeMapSupportsNullKey(){
        TreeMap<String, String> treeMap = new TreeMap<>(new Task7.MyComparator());
        treeMap.put(null, "Test");

        System.out.println(treeMap.containsKey(null));
    }




}



