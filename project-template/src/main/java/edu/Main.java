package edu;

import edu.hw6.Task6;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import static edu.hw6.Task5.HackerNews.hackerNewsTopStories;
import static edu.hw6.Task5.HackerNews.news;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

        ArrayList<String[]> ans = Task6.portAnalysis();

        for(var elem:ans){
            System.out.println(elem[0] + " -> " + elem[1]);
        }


    }
}
