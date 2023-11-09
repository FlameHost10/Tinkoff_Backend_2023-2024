package edu.project1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Project1 {
    public static void run() throws IOException {
        String word = wordChange();
        Gallows mainGallows = new Gallows(word);
        Scanner sc = new Scanner(System.in);
        boolean flag = true; //Продолжаем игру?

        System.out.println("The game has begun. Word length: " + 5);
        System.out.println("If you want to finish the game, click '!'");
        while(flag){
            String userInput = sc.next();
            flag = mainGallows.guessLetter(userInput);
        }
    }

    public static String wordChange() throws IOException {
        int lenFile = 5;
        int indWord = (int)(Math.random() * (lenFile));
        String word;
        FileReader reader = new FileReader("C:\\Users\\User\\JavaProjects\\Tinkoff_2023\\project-template\\src\\main\\resources\\project1\\words");
        BufferedReader br = new BufferedReader(reader);
        while(indWord > 0){
            br.readLine();
            indWord--;
        }
        word = br.readLine();
        return word;
    }

}
