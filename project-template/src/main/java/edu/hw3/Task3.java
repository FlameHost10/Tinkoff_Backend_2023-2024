package edu.hw3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task3 {
     public static <E> Map<Object, Integer> freqDict(E[] array){
         Map<Object, Integer> mapCounter = new HashMap<>();
         for(var elem: array){
              mapCounter.put(elem, (mapCounter.containsKey(elem)) ? mapCounter.get(elem) + 1 : 1);
         }
         return  mapCounter;
     }
}
