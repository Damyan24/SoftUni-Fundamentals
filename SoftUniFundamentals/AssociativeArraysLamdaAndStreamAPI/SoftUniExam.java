package SoftUniFundamentals.AssociativeArraysLamdaAndStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String , Integer> students = new LinkedHashMap<>();
        Map<String , Integer> occurencies = new LinkedHashMap<>();

        String info = scan.nextLine();
        while (!info.equals("exam finished")){
            String [] tokens = info.split("-");

            if(tokens.length == 3){
                String name = tokens[0];
                String language = tokens[1];
                int score = Integer.parseInt(tokens[2]);
                if(students.get(name) == null || students.get(name) < score){
                    students.put(name , score);
                }

                if(occurencies.get(language) == null){
                    occurencies.put(language , 1);
                } else{
                    int newNum  = occurencies.get(language) + 1;
                    occurencies.put(language , newNum);
                }
            }

            if(tokens.length == 2){
                String ban = tokens[0];
                students.remove(ban);
            }



            info = scan.nextLine();
        }

        System.out.println("Results:");
        for(Map.Entry<String , Integer> entry : students.entrySet()){
            System.out.println(entry.getKey() +" | " + entry.getValue());
        }
        System.out.println("Submissions:");
        for(Map.Entry<String , Integer> entry : occurencies.entrySet()){
            System.out.println(entry.getKey() +" - " + entry.getValue());
        }

    }
}
