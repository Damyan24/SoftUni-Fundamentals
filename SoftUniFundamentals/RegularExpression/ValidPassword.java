package SoftUniFundamentals.RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        for(int i = 0 ; i < n ; i++){

            String line = scan.nextLine();

            Pattern pat = Pattern.compile("([_]{1}[\\.]+[A-Z]{1}[a-zA-Z0-9]{4,}[A-Z]{1}[_]{1}.{1})");
            Matcher mat = pat.matcher(line);

            List<String> group = new ArrayList<>();

            if (mat.find()){
                String found = mat.group(1);
                Pattern pat1 = Pattern.compile("(\\d{1})");
                Matcher mat1 = pat1.matcher(found);

                while (mat1.find()){
                    group.add(mat1.group(1));
                }

                if(group.size() == 0){
                    System.out.println("Group: default");

                }else {
                    StringBuilder nums = new StringBuilder();
                    for (String s : group) {
                        nums.append(s);
                    }
                    System.out.println("Group: " + nums);
                }
            }else{
                System.out.println("Invalid pass!");
            }



        }
    }
}
