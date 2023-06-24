package MidExam;
import java.util.ArrayList;
import java.util.Collections;
import  java.util.Scanner;
import java.util.List;
public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nums = scan.nextLine().split(" ");
        int[] newNums = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {

            newNums[i] = Integer.parseInt(nums[i]);

        }


        int sum = 0;

        for (int i = 0; i < newNums.length; i++) {
            sum += newNums[i];
        }

        double average = (double) sum / newNums.length;

        List<Integer> higherThanAverage = new ArrayList<>();

        for (int i = 0; i < newNums.length; i++) {
            if (newNums[i] > average) {
                higherThanAverage.add(newNums[i]);
            }
        }



        Collections.sort(higherThanAverage);

        if(higherThanAverage.size() == 0){
            System.out.println("No");
        }

        if(higherThanAverage.size() <= 5){

                for(int i = higherThanAverage.size() - 1; i >= 0; i-- ){
                    System.out.print(higherThanAverage.get(i)+ " ");
                }

            }


        else{
            for(int i = higherThanAverage.size() - 1 ; i > higherThanAverage.size() - 6; i--){
                System.out.print(higherThanAverage.get(i) + " ");
            }


        }
        }


        }





