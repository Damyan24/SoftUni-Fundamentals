package ObjectsAndClasses.Lab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;



public class Factorial {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        BigInteger factorial;

        factorial = BigInteger.valueOf(1);

        for(int i = 1 ; i <= n; i++){

            BigInteger curent = BigInteger.valueOf(i);

            factorial = factorial.multiply(curent);


        }
        System.out.println(factorial);
    }


}
