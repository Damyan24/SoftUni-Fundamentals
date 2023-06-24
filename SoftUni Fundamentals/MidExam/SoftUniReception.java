package MidExam;

import java.util.Scanner;
public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstEmployee = scan.nextInt();
        int secondEmployee = scan.nextInt();
        int thirdEmployee = scan.nextInt();
        int waiting = scan.nextInt();

        int maxPerHour = firstEmployee + secondEmployee + thirdEmployee;
        int hoursNeeded = 0;


        while(waiting > 0){
            hoursNeeded++;
            if(hoursNeeded % 4 != 0){
                waiting -= maxPerHour;
            }

        }

        System.out.println("Time needed: " + hoursNeeded +"h.");

    }
}
