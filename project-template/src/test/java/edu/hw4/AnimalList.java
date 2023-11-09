package edu.hw4;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    public final static ArrayList<Animal> animals = new ArrayList<>(){{
        add(new Animal("Bob", Animal.Type.CAT, Animal.Sex.M, 2, 30, 3000, false));
        add(new Animal("Tomi", Animal.Type.DOG, Animal.Sex.F, 4, 50, 5000, true));
        add(new Animal("Tod", Animal.Type.FISH, Animal.Sex.M, 1, 10, 1000, false));
        add(new Animal("Molly", Animal.Type.BIRD, Animal.Sex.F, 3, 25, 3000, false));
        add(new Animal("Maggie", Animal.Type.SPIDER, Animal.Sex.F, 1, 5, 20, true));
        add(new Animal("Buddy M", Animal.Type.DOG, Animal.Sex.M, 7, 120, 10000, true));
        add(new Animal("Bo", Animal.Type.CAT, Animal.Sex.F, 2, 35, 3000, false));
        add(new Animal("Shadow", Animal.Type.DOG, Animal.Sex.F, 4, 55, 6000, true));
        add(new Animal("Max", Animal.Type.DOG, Animal.Sex.F, 2, 53, 6000, false));

    }};

    public static ArrayList<Animal> getAnimals(){
        ArrayList<Animal> animalsClone = new ArrayList<Animal>(animals.size());
        animalsClone.addAll(animals);
        return animalsClone;
    }
}
