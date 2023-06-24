package SoftUniFundamentals.MidExam;
import java.util.Scanner;
import java.util.List;
public class ArrayModifier {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] strNums = scan.nextLine().split(" ");

        int [] nums = new int[strNums.length];

        for(int i = 0 ; i < strNums.length; i++){
            nums[i] = Integer.parseInt(strNums[i]);
        }

        String command = scan.nextLine();

        while (!command.equals("end")){

            commandMethods(command , nums);



            command = scan.nextLine();
        }
        print(nums);

    }

    public static void commandMethods(String com , int[] numbers){
        String [] tokens = com.split(" ");
        String comand = tokens[0];

        switch (comand){
            case "swap":
                int index1 =Integer.parseInt(tokens[1]);
                int index2 =Integer.parseInt(tokens[2]);

                int temp = numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2] = temp;
                break;
            case "multiply":
                int num1 =numbers[Integer.parseInt(tokens[1])];
                int num2 =numbers[Integer.parseInt(tokens[2])];

                int sum = num1 * num2;

                numbers[Integer.parseInt(tokens[1])] = sum;

                break;
            case "decrease":
                for(int i = 0; i < numbers.length; i++){
                    numbers[i] -= 1;
                }

                break;




        }

    }

    public static  void print(int [] nums){
        for(int i = 0; i < nums.length; i++){
            if(i != nums.length - 1){
                System.out.print(nums[i] +", ");
            }else{
                System.out.print(nums[i]);
            }
        }
    }
}
