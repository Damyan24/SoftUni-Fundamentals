package SoftUniFundamentals.RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        Pattern pat = Pattern.compile("([a-zA-Z0-9]+[_\\-\\.]?[a-zA-Z0-9]+@)([a-zA-Z-]+(\\.[a-zA-Z-]+)+)");
        Matcher mat = pat.matcher(line);

        while (mat.find()){
            System.out.println(mat.group(1)+mat.group(2));
        }
    }
}
