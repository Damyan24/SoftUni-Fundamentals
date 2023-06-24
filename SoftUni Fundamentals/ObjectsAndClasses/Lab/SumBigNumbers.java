package ObjectsAndClasses.Lab;
import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger A = new BigInteger(scan.nextLine());
        BigInteger B = new BigInteger(scan.nextLine());

        BigInteger sum = A.add(B);
        System.out.println(sum);

    }
}
