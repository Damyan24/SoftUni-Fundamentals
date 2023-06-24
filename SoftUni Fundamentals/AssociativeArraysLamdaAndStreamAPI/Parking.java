package AssociativeArraysLamdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String , String> parkingInfo = new LinkedHashMap<>();

        for(int i = n ; i > 0; i--){
            String [] tokens = scan.nextLine().split(" ");
            String command = tokens[0];
            String name = tokens[1];


         switch (command){
             case "register":
                 String plate = tokens[2];
                 if(parkingInfo.get(name) == null){
                     System.out.println(name + " registered " + plate + " successfully%n");
                     parkingInfo.put(name , plate);
                 }else {
                     System.out.println("ERROR: already registered with plate number " + plate +"%n");
                 }
                 break;
             case "unregister":
                 if(parkingInfo.get(name) == null){
                     System.out.println("ERROR: user " + name + " not found %n");
                 }else{
                     System.out.println(name + " unregistered successfully %n");
                     parkingInfo.remove(name);
                 }
                 break;
         }



        }

        for(Map.Entry<String , String> entry : parkingInfo.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }



}
