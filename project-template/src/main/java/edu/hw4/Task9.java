package edu.hw4;

import java.util.List;

public class Task9 {
    public static Integer pawCounter(List<Animal> animals){
        int ans = 0;
        for(var animal:animals){
            switch (animal.type()){
                case DOG, CAT -> ans += 4;
                case BIRD -> ans += 2;
                case FISH -> ans += 0;
                case SPIDER -> ans += 8;
            }
        }
        return ans;
    }
}
