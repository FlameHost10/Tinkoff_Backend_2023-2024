package edu.hw1;

public class Task7 {
    public static int rotateRight(int numb, int shift){
        String binary = Integer.toBinaryString(numb);
        int len = binary.length();
        shift = shift % len;
        String moving_substring = binary.substring(binary.length() - shift);
        binary = (moving_substring + binary).substring(0, len);
        return Integer.parseInt(binary, 2);
    }

    public static int rotateLeft(int numb, int shift){
        String binary = Integer.toBinaryString(numb);
        int len = binary.length();
        shift = shift % len;
        String moving_substring = binary.substring(0, shift);
        binary = (binary + moving_substring).substring(shift);
        return Integer.parseInt(binary, 2);
    }
}
