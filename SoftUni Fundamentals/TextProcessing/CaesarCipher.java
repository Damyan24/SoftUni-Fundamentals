package TextProcessing;
import  java.util.Scanner;
public class  CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        StringBuilder strBD = new StringBuilder();
        strBD.append(str);

        for(int i = 0 ; i < str.length(); i++){
            int newCharVal = str.charAt(i) + 3;
            char newChar = (char) newCharVal;
            strBD.setCharAt(i , newChar);

        }
        System.out.println(strBD);

    }
}
