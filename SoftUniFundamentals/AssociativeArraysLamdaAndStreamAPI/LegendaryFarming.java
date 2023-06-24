package SoftUniFundamentals.AssociativeArraysLamdaAndStreamAPI;

import java.util.Scanner;
import java.util.Map;
import  java.util.LinkedHashMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> items = new LinkedHashMap<>();


        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
        String line = scan.nextLine();


       while (!line.isEmpty()){
           String [] info = line.split(" ");

           for(int i = 0 ; i < info.length ; i+=2){
               int num = Integer.parseInt(info[i]);
               String product = info[i + 1].toLowerCase();
               if(items.get("shards") < 250 && items.get("fragments") < 250 && items.get("motes") < 250){
                   if(items.get(product) == null){
                       items.put(product , num);
                   }else {
                       items.put(product , items.get(product) + num);
                   }
               }else{
                   break;
               }
           }
           if(!(items.get("shards") < 250 && items.get("fragments") < 250 && items.get("motes") < 250)){
               break;
           }
          line = scan.nextLine();
       }


       if(items.get("shards") >= 250) {
           System.out.println("Shadowmourne obtained!");
           items.put("shards", items.get("shards") - 250);
       }
        if(items.get("fragments") >= 250){
            System.out.println("Valanyr obtained!");
            items.put("fragments" , items.get("fragments") - 250);
        }
        if(items.get("motes") >= 250){
            System.out.println("Dragonwrath obtained!");
            items.put("motes" , items.get("motes") - 250);
        }
    for(Map.Entry<String , Integer> entry : items.entrySet() ){
        System.out.println(entry.getKey()+": " + entry.getValue());
    }
    }


}



