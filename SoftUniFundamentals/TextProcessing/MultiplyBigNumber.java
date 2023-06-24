package SoftUniFundamentals.TextProcessing;
import  java.util.Scanner;
public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  big = scanner.nextLine();
        int small = Integer.parseInt(scanner.nextLine());

        StringBuilder stB = new StringBuilder();
        int remainder = 0 ;
        for(int i = big.length() - 1 ; i >= 0 ; i--){
            int num = Character.getNumericValue(big.charAt(i)) * small + remainder;
            if(i == 0){
                stB.insert(0 , num);
            }else {
                int digitToAdd = num % 10;
                remainder = num / 10;
                stB.insert(0 , digitToAdd);
            }

        }

        while ((stB.charAt(0) == '0' && stB.length() > 1)){
            stB.deleteCharAt(0);
        }
        System.out.println(stB);


 }
}