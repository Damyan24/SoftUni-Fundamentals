package ObjectsAndClasses.Lab;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertismentMessage {
    public static void main(String[] args) {

        List<String> phrases = new ArrayList<>();
        List<String> events = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        List<String> cities = new ArrayList<>();

        phrases.add("Excellent product.");
        phrases.add("Such a great product.");
        phrases.add("I always use that product.");
        phrases.add("Best product of its category.");
        phrases.add("Exceptional product.");
        phrases.add("I can’t live without this product.");

        events.add("Now I feel good.");
        events.add("I have succeeded with this product.");
        events.add("Makes miracles. I am happy of the result!");
        events.add("I cannot believe but now I feel awesome.");
        events.add("Try it yourself, I am very satisfied.");
        events.add("II feel great!");

        authors.add("Diana");
        authors.add("Petya");
        authors.add("Stella");
        authors.add("Elena");
        authors.add("Katya");
        authors.add("Iva");
        authors.add("Annie");
        authors.add("Eva");

        cities.add("Burgas");
        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add("Varna");
        cities.add("Ruse");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Random rng = new Random();

        for(int i = 0; i < n; i++){
            int phrasheIndex = rng.nextInt(phrases.size());
            int eventIndex = rng.nextInt(events.size());
            int authorIndex = rng.nextInt(authors.size());
            int citiesIndex = rng.nextInt(cities.size());


            System.out.println(phrases.get(phrasheIndex) + " " + events.get(eventIndex) + " " + authors.get(authorIndex) + " - " + cities.get(citiesIndex));


        }



    }
}
