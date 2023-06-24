package SoftUniFundamentals.TextProcessing;
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder stB = new StringBuilder();
        stB.append(scan.nextLine());
        int power = 0;
        for(int i = 0 ; i <= stB.length() - 1 ; i++) {
            if(power > 0 && stB.charAt(i) != '>'){
                stB.deleteCharAt(i);
                power--;
                i--;
            }else if(stB.charAt(i) == '>'){
                power += Character.getNumericValue(stB.charAt(i + 1));
            }
        }





        System.out.println(stB);
    }
}
