package RegularExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        List<String> atacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();


        for(int i = 0 ; i < n ; i++){
            String line = scan.nextLine();
            int starCount = 0;

            Pattern pat = Pattern.compile("[starSTAR]");
            Matcher mat = pat.matcher(line);

            while (mat.find()){
                starCount++;
            }

            StringBuilder stb = new StringBuilder();

            for(int k = 0 ; k <line.length(); k++){
                int charNum = line.charAt(k) - starCount;
                char newChar = (char) charNum;

               stb.append(newChar);
            }

            Pattern pat1 = Pattern.compile("[^@\\-!:>]*@([A-Z][a-z]*)[^@\\-!:>]*:(\\d+)[^@\\-!:>]*!([A|D])![^@\\-!:>]*->(\\d+)[^@\\-!:>]*");
            Matcher match = pat1.matcher(stb);

            if(match.find()){
                if(match.group(3).equals("D")){
                    destroyed.add(match.group(1));
                }else {
                    atacked.add(match.group(1));
                }
            }

        }

        System.out.println("Attacked planets: " + atacked.size());
        Collections.sort(atacked);
        for(String s : atacked){
            System.out.println("-> "+s);
        }
        System.out.println("Destroyed planets: " + destroyed.size());
        Collections.sort(destroyed);
        for(String s : destroyed){
            System.out.println("-> "+s);
        }
    }
}
