package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static edu.hw4.AnimalList.getAnimals;

public class Test18 {


    private final static ArrayList<Animal> animalsFirstList = new ArrayList<>(){{
        add(new Animal("Bob", Animal.Type.FISH, Animal.Sex.M, 2, 30, 3, false));
        add(new Animal("Tomi", Animal.Type.DOG, Animal.Sex.F, 4, 50, 5, true));
        add(new Animal("Tod", Animal.Type.FISH, Animal.Sex.M, 1, 10, 1, false));
        add(new Animal("Molly", Animal.Type.FISH, Animal.Sex.F, 3, 25, 3, false));
    }};

    private final static ArrayList<Animal> animalsSecondList = new ArrayList<>(){{
        add(new Animal("Maggie", Animal.Type.SPIDER, Animal.Sex.F, 1, 5, 1, true));
        add(new Animal("Buddy M", Animal.Type.FISH, Animal.Sex.M, 7, 120, 10, false));
        add(new Animal("Bo", Animal.Type.CAT, Animal.Sex.F, 2, 35, 3, false));
    }};

    private final static ArrayList<Animal> animalsThirdList = new ArrayList<>(){{
        add(new Animal("Shadow", Animal.Type.DOG, Animal.Sex.F, 4, 55, 6, true));
        add(new Animal("Max", Animal.Type.FISH, Animal.Sex.F, 2, 5, 6, true));
    }};


    @Test
    @DisplayName("Найти самую тяжелую рыбку в 2-х или более списках")
    void areSpidersMoreBitingThanDogsTest() {

        Animal heaviestFishAllLists = Task18.heaviestFish(animalsFirstList, animalsSecondList, animalsThirdList);
        Animal heaviestFishTwoLists1 = Task18.heaviestFish(animalsFirstList, animalsSecondList);
        Animal heaviestFishTwoLists2 = Task18.heaviestFish(animalsFirstList, animalsThirdList);

        System.out.println("List first");
        for(var animal: animalsFirstList){
            System.out.println(animal);
        }

        System.out.println();
        System.out.println("List second");
        for(var animal: animalsSecondList){
            System.out.println(animal);
        }

        System.out.println();
        System.out.println("List third");
        for(var animal: animalsThirdList){
            System.out.println(animal);
        }


        System.out.println();

        System.out.println("The heaviest fish in all the lists:" + heaviestFishAllLists);
        System.out.println("The heaviest fish in first and second lists:" + heaviestFishTwoLists1);
        System.out.println("The heaviest fish in first and third lists:" + heaviestFishTwoLists2);


    }
}
