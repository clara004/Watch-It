package Watchit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie(1, "Example","2024-12-09", 150, "Polaa", "Om el donya", 100000, 5000000, Arrays.asList(3.0f, 4.0f, 4.5f, 2.0f), Arrays.asList("Arabic", "English"), Arrays.asList("Comedy", "Drama"), Arrays.asList("Youssefff", "Mariaaa"));

        System.out.println("Watchit.Movie details: " + movie);
        System.out.println("Rating: " + movie.calcRating());
        System.out.println("Watchit.Movie duration: " + movie.CalcDuration());
    }
}