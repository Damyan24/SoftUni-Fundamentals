package TextProcessing;
import  java.util.Scanner;
public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();
        int startingIndex = file.lastIndexOf('\\');
        int dotIndex = file.lastIndexOf('.');
        String sub1 = file.substring(startingIndex + 1 , dotIndex);
        String sub = file.substring(dotIndex + 1);

        System.out.println("File name: " + sub1);
        System.out.println("File extension: " + sub);

    }
}
