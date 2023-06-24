package TextProcessing;
import  java.util.Scanner;
public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        StringBuilder stB  =new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++) {
            if (i != str.length() - 1) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    stB.append(str.charAt(i));
                }
                    }else {
                        stB.append(str.charAt(i));
            }
        }
        System.out.println(stB);
    }
}
