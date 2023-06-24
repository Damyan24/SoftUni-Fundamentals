package SoftUniFundamentals.RegularExpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        double sum = 0;
        System.out.println("Bought furniture:");
        while (!line.equals("Purchase")){
            Pattern pat = Pattern.compile(">>(\\w+)<<([\\d.]+)!(\\d+)");
            Matcher mat = pat.matcher(line);


            if(mat.find()){
                double price = Double.parseDouble(mat.group(2));
                int quantity = Integer.parseInt(mat.group(3));
                System.out.println(mat.group(1));
                sum += price * quantity;
            }







            line = scan.nextLine();
        }


        System.out.printf("Total money spend: %.2f" , sum);

    }
}
