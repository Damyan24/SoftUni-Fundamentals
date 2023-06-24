package AssociativeArraysLamdaAndStreamAPI;


import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class CountCharsInString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String line = scan.nextLine();

        List<Character> chars = new ArrayList<>();

        for(int i = 0 ; i < line.length();i++){
            if(line.charAt(i) != ' ' ){
                chars.add(line.charAt(i));
            }
        }

        Map<Character , Integer> occurencies = new LinkedHashMap<>();
        for(Character c : chars){
         if(occurencies.get(c) == null){
             occurencies.put(c , 1);
         }else{
             int currentCount = occurencies.get(c);
             occurencies.put(c , currentCount + 1);
         }
        }

        for(Map.Entry<Character , Integer> entry : occurencies.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }




}
