package edu.hw6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

public class Test5 {
    @Test
    @DisplayName("Hacker News")
    void HackerNewsTest() throws IOException, URISyntaxException, InterruptedException {

        System.out.println(Arrays.toString(Task5.HackerNews.hackerNewsTopStories()));
        String newsTitle = Task5.HackerNews.news(37570037);
        System.out.println(newsTitle);

    }
}
