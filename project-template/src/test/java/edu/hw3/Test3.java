package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.Objects;

public class Test3 {
    @Test
    @DisplayName("Количество вхождений элемента")
    void mapCounter(){
        Map<Object, Integer> map1 = Task3.freqDict(new Integer[]{1, 2, 1, 1, 3, 2, 4, 5, 5});
        System.out.println(map1);
        System.out.println("==============");

        Map<Object, Integer> map2 = Task3.freqDict(new Character[]{'a', 'b', 'b', 'b', 'c'});
        System.out.println(map2);
        System.out.println("==============");

        Map<Object, Integer> map3 = Task3.freqDict(new People[]{new People("Bob", 13), new People("Tom", 20), new People("Bob", 13)});
        System.out.println(map3);
        System.out.println("==============");
    }
    class People{
        private String name;
        private int age;

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            People people = (People) o;
            return age == people.age && Objects.equals(name, people.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override public String toString() {
            return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
        }
    }
}

