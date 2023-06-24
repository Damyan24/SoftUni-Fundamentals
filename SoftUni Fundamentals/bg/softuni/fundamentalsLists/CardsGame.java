package bg.softuni.fundamentalsLists;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class CardsGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] firstLine = scan.nextLine().split(" ");
        String [] secondLine = scan.nextLine().split(" ");

        List<Integer> first = arrayToList(firstLine);
        List<Integer> second = arrayToList(secondLine);

        while (first.size() != 0 && second.size() != 0){

            findTheWinner(first , second);



        }
        int sum = 0;
        if(first.size() == 0){

            for (Integer integer : second) {
                sum += integer;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }

        if(second.size() == 0){

            for (Integer integer : first) {
                sum += integer;
            }
            System.out.println("First player wins! Sum: " + sum);
        }


    }

    public static List<Integer> arrayToList (String[]wag){
        List<Integer> newWagons = new ArrayList<>();

        for (String s : wag) {
            newWagons.add(Integer.parseInt(s));
        }
        return newWagons;
    }


    public  static void findTheWinner(List<Integer> first , List<Integer> second){

        if(first.get(0) > second.get(0)){
            first.add(first.get(0));
            first.add(second.get(0));
            first.remove(first.get(0));
            second.remove(0);
        } else if (first.get(0) < second.get(0)){
            second.add(second.get(0));
            second.add(first.get(0));
            second.remove(second.get(0));
            first.remove(0);
        } else {
            second.remove(0);
            first.remove(0);
        }

    }

}
