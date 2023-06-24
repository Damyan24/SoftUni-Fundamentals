package SoftUniFundamentals.RegularExpression;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        double sum = 0;
        while (!line.equals("end of shift")){

            Pattern pat = Pattern.compile("[^.%$|]*%([A-Z][a-z]+)%[^.%$|]*<(\\w+)>[^.%$|]*\\|(\\d+)\\|(\\d+|\\d+.\\d+)\\$[^.%$|]*");
            Matcher mat = pat.matcher(line);

            if(mat.find()){
                double currentSum = Integer.parseInt(mat.group(3)) * Double.parseDouble(mat.group(4));
                sum+=currentSum;
                System.out.printf("%s: %s - %.2f%n",mat.group(1),mat.group(2),currentSum);
            }



            line = scan.nextLine();
        }
        System.out.printf("Total income: %.2f" , sum);
    }
}
