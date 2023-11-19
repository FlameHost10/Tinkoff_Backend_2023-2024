package edu.hw6;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.net.http.HttpClient.newHttpClient;

public class Task5 {

    public static class HackerNews{

        public static long[] hackerNewsTopStories() throws URISyntaxException, IOException, InterruptedException {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://hacker-news.firebaseio.com/v0/topstories.json"))
                .GET()
                .build();

            HttpResponse<String> response = newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            String[] responseStrings = response.body().split(",");
            long[] responseLong = new long[responseStrings.length];

            responseLong[0] = Long.parseLong(responseStrings[0].substring(1));
            responseLong[responseStrings.length - 1] =
                Long.parseLong(responseStrings[responseStrings.length - 1].substring(0,responseStrings[responseStrings.length - 1].length() - 1));

            for(int i = 1; i < responseStrings.length - 1; i++){
                responseLong[i] = Long.parseLong(responseStrings[i]);
            }


            return responseLong;
        }


        public static String news(long ind) throws URISyntaxException, IOException, InterruptedException {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://hacker-news.firebaseio.com/v0/item/" + ind + ".json"))
                .GET()
                .build();

            HttpResponse<String> response = newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            Pattern pattern = Pattern.compile("\"title\":\"([^\"]*)\"");

            Matcher matcher = pattern.matcher(response.body());
            if ( matcher.find() ) {
                return matcher.group(1);
            }
            else{
                return "Invalid number";
            }



        }
    }

}
