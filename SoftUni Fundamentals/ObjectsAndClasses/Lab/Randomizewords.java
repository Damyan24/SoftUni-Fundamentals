package ObjectsAndClasses.Lab;
import java.util.*;

public class Randomizewords {




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        Random rnd = new Random();



        for (int i = words.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        for(int i = 0 ; i < words.length; i++){
            System.out.println(words[i]);
        }

    }
}
