package SoftUniFundamentals.bg.softuni.fundamentalsLists;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] nums = scan.nextLine().split(" ");
        List<Integer> listNums = ArrayToList(nums);

        String command = scan.nextLine();

        while (!command.equals("end")){
            doCommand(command , listNums);
            command = scan.nextLine();
        }

        printList(listNums);





    }

    public static List<Integer> ArrayToList(String [] wag){
        List<Integer> newWagons = new ArrayList<>();

        for (String s : wag) {
            newWagons.add(Integer.parseInt(s));
        }

        return newWagons;




    }

    public static  void doCommand(String  commands , List<Integer> wagon) {
        String [] command = commands.split(" ");

        if(command[0].equals("Delete")){
            wagon.removeAll(List.of(Integer.parseInt(command[1])));
        }

        if(command[0].equals("Insert")){
            Insert(commands , wagon);


        }

        }



    public static  void printList(List<Integer> wagon){
        for(int i : wagon){
            System.out.print(i + " ");

        }
    }

    public  static void Insert(String commands,List<Integer> wagon){
        String [] command = commands.split(" ");
        int element = Integer.parseInt(command[1]);
        int index = Integer.parseInt(command[2]);

        wagon.add(index , element);



    }
}
