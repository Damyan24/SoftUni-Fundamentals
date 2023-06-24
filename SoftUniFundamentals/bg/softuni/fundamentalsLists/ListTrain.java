package SoftUniFundamentals.bg.softuni.fundamentalsLists;
import java.util.ArrayList;

import java.util.List;
import  java.util.Scanner;
public class ListTrain {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String [] wagons = scan.nextLine().split(" ");




       List <Integer> wagon =  ArrayToList(wagons);


        int max = Integer.parseInt(scan.nextLine());


        String command = scan.nextLine();


        while(!command.equals("end") && !command.equals("")){
            doCommand(command , wagon , max);
            command = scan.nextLine();
        }



        printWagons(wagon);



    }
    public static List<Integer> ArrayToList(String [] wag){
        List<Integer> newWagons = new ArrayList<>();

        for (String s : wag) {
            newWagons.add(Integer.parseInt(s));
        }

        return newWagons;



    }

    public static  void doCommand(String commands , List<Integer> wagon , int max){
        String [] command = commands.split(" ");

        if(command[0].equals("Add") && Integer.parseInt(command[1]) <= max){
            wagon.add(Integer.parseInt(command[1]));
        } else{
            int num = Integer.parseInt(command[0]);
            for(int i = 0 ; i < wagon.size(); i++){
                int current = wagon.get(i);
                int newValue  = num + current;
                if (newValue <= max){
                    wagon.set(i , newValue);
                        break;
                    }
                }

                }
            }



        public static  void printWagons(List<Integer> wagon){
        for(int i : wagon){
            if(i == wagon.size()){
                System.out.print(i);
            }else{
                System.out.print(i + " ");
            }

        }
        }
    }


