
package SoftUniFundamentals.FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddAstra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String foods = scan.nextLine();

        Pattern pat = Pattern.compile("([#|]){1}([a-zA-Z\\s]+)([#|]){1}(\\d{2}\\/\\d{2}\\/\\d{2})([#|])(\\d{1,4})([#|])");
        Matcher mat = pat.matcher(foods);
        int totalCalories = 0;
        List<String> items = new ArrayList<>();
        while (mat.find()){
            String char1 = mat.group(1);
            String char2 = mat.group(3);
            String char4 = mat.group(5);
            String char3 = mat.group(7);

            String together = char1 + char2 + char3 + char4;
            boolean theSame = true;

            for(int i = 1 ; i < together.length() ;i++){
                if(together.charAt(i) != together.charAt(0)){
                    theSame = false;
                }
            }

             if(theSame){
                totalCalories += Integer.parseInt(mat.group(6));
                items.add("Item: " + mat.group(2) + ", Best before: " + mat.group(4) + ", Nutrition: " + mat.group(6));
            }
        }
        int days = totalCalories / 2000;
        System.out.println("You have food to last you for: " + days + " days!");

        for(int i =0 ; i < items.size(); i++){
            System.out.println(items.get(i));
        }
    }







}
