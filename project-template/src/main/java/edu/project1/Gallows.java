package edu.project1;

import javax.print.DocFlavor;

public class Gallows {
    private String word;
    private int lenWord;
    private char[] guessedLetters;// массив, который показывает, какие буквы уже угадали, а какие нет.
    private int numberAttempts = 5;
    private int numberOfLettersGuessed = 0;
    private Pictures pictures = new Pictures();

    public Gallows(String word){
        this.word = word;
        this.lenWord = word.length();
        this.guessedLetters = new char[lenWord];
        for(int i = 0; i < lenWord; i++){
            guessedLetters[i] = '*';
        }
    }

    private void wordOutput(){
        System.out.println(String.valueOf(guessedLetters));
    }

    private void giveUp(){
        System.out.println("The hidden word:\t" + word);
    }

    public boolean guessLetter(String userInput){
        if(userInput.length() == 1 && userInput.charAt(0) == '!'){
            giveUp();
            return true;
        }
        else if(userInput.length() == 1 && ((userInput.charAt(0) >= 'a' && userInput.charAt(0) <= 'z' || userInput.charAt(0) >= 'A' && userInput.charAt(0) <= 'Z'))){
            return guessLetterClean(Character.toLowerCase(userInput.charAt(0)));
        }
        else{
            System.out.println("incorrect data");
            System.out.println("==================");
            return true;
        }

    }

    private boolean guessLetterClean(char letter){//корректные данные
        if(word.indexOf(letter) != -1 && guessedLetters[word.indexOf(letter)] != '*'){
            System.out.println("Have you tried this letter yet");
        }
        else if(word.indexOf(letter) != -1){
            for(int i = 0; i < lenWord; i++){
                if(word.charAt(i) == letter){
                    guessedLetters[i] = letter;
                    numberOfLettersGuessed++;
                }
            }

            System.out.println("You guessed right");
            wordOutput();
            if(numberOfLettersGuessed == lenWord){
                System.out.println("You have won");
                return false;
            }
        }
        else{
            System.out.println("You made a mistake");
            numberAttempts--;
            System.out.println(numberAttempts + " out of 5 attempts left");
            pictures.output(4 - numberAttempts);
            if(numberAttempts == 0){
                System.out.println("You've lost.");
                giveUp();
                return false;
            }
        }

        System.out.println("=================================");
        return true;


    }




}

