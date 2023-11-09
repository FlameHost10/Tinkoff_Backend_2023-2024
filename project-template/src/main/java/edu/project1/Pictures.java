package edu.project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Pictures {
    private final ArrayList<String> array_pictures = new ArrayList<>();

    public Pictures(){
        String first = "       \n"
                    + "       \n"
                    + "       \n"
                    + "       \n"
                    + "       \n"
                    + " *     \n"
                    + "* *    \n";

        array_pictures.add(first);

        String second = " *     \n"
                    + " *     \n"
                    + " *     \n"
                    + " *     \n"
                    + " *     \n"
                    + " *     \n"
                    + "* *    \n";
        array_pictures.add(second);

        String third = " ***** \n"
                    + " *   * \n"
                    + " *     \n"
                    + " *     \n"
                    + " *     \n"
                    + " *     \n"
                    + "* *    \n";
        array_pictures.add(third);

        String fourth = " ***** \n"
                    + " *   * \n"
                    + " *   @ \n"
                    + " *     \n"
                    + " *     \n"
                    + " *     \n"
                    + "* *    \n";
        array_pictures.add(fourth);


        String fifth = " ***** \n"
                    + " *   * \n"
                    + " *   @ \n"
                    + " *  -!-\n"
                    + " *  / \\\n"
                    + " *     \n"
                    + "* *    \n";
        array_pictures.add(fifth);
    }

    public void output(int ind){
        System.out.println(array_pictures.get(ind));

    }
}
