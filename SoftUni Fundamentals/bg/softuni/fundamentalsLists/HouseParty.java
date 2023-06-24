package bg.softuni.fundamentalsLists;
import java.util.ArrayList;
import  java.util.Scanner;
import java.util.List;
public class HouseParty {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> people = new ArrayList<>();

        for (int i = 0 ; i < n  ; i++){
            String [] commands = scan.nextLine().split(" ");
            if(!commands[2].equals("not") && !people.contains(commands[0])){
                people.add(commands[0]);
            } else if (!commands[2].equals("not") && people.contains(commands[0])){
                System.out.println(commands[0] + " is already in the list!");
            }else if(commands[2].equals("not") && !people.contains(commands[0])){
                System.out.println(commands[0] + " is not in the list!");
            } else{
                String obj = commands[0];
                people.remove(obj);
            }

        }
        for(String s : people){
            System.out.println(s);
        }
    }

}
