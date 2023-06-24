package SoftUniFundamentals.RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NeterRealms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String [] demons = line.split(",\\s*");



        for(int i = 0 ; i < demons.length; i++){
            String current = demons[i];

            int health = 0;
            double dmg = 0;


            int multiplyCount = 0;
            int divisionCount = 0;
            double minusFloat = 0;

            Pattern healthFind = Pattern.compile("([^0-9+\\-*./])");
            Matcher healthMatch = healthFind.matcher(current);


            while (healthMatch.find()){

                health += healthMatch.group(1).charAt(0);
            }






            Pattern multiplyOrDivide = Pattern.compile("([*|/])");
            Matcher finder = multiplyOrDivide.matcher(current);

            while (finder.find()){
                if(finder.group(1).equals("*")){
                    multiplyCount++;
                }else {
                    divisionCount++;
                }
            }

            Pattern negativeDouble = Pattern.compile("([\\D]?)(\\d{1}\\.\\d{1}|\\d{1})");
            Matcher match = negativeDouble.matcher(current);

            while (match.find()){
                if(match.group(1).equals("-")){
                    minusFloat -= Double.parseDouble(match.group(2));
                }else {
                    minusFloat += Double.parseDouble(match.group(2));
                }
            }



            if(divisionCount > 0 && multiplyCount > 0) {
                dmg += minusFloat * (multiplyCount * 2) / (divisionCount * 2);
            }else if (divisionCount == 0 && multiplyCount > 0){
                dmg += minusFloat * multiplyCount * 2;
            }else if (divisionCount > 0 && multiplyCount == 0){
                dmg += minusFloat / divisionCount * 2;
            }else{
                dmg = minusFloat;
            }
            System.out.printf("%s - %d health, %.2f damage%n",current , health , dmg);

        }


    }
}
