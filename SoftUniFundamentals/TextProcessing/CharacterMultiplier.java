package SoftUniFundamentals.TextProcessing;
import  java.util.Scanner;
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strings = scan.nextLine().split(" ");
        String str1 = strings[0];
        String str2 = strings[1];


        int totalSum = 0;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                int value1 = str1.charAt(i);
                int value2 = str2.charAt(i);
                int sum = value1 * value2;
                totalSum += sum;
            }
        } else {
            if (str1.length() > str2.length()) {
                for (int i = 0; i < str2.length(); i++) {
                    totalSum += str1.charAt(i) * str2.charAt(i);
                }

                for (int i = str2.length(); i < str1.length(); i++) {
                    totalSum += str1.charAt(i);
                }

            } else {
                for (int i = 0; i < str1.length(); i++) {
                    totalSum += str1.charAt(i) * str2.charAt(i);
                }

                for (int i = str1.length(); i < str2.length(); i++) {
                    totalSum += str2.charAt(i);
                }
            }
        }
            System.out.println(totalSum);
    }
}
