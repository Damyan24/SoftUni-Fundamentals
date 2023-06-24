package SoftUniFundamentals.bg.softuni.fundamentalsLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");



        String[] command = scan.nextLine().split(" ");




        List<Integer> numList = arrayToList(nums);

        while (!command[0].equals("End")) {
            Operations(command, numList);
            command = scan.nextLine().split(" ");
        }

        printList(numList);
    }

    public static List<Integer> arrayToList(String[] str) {
        List<Integer> numList = new ArrayList<>();
        for (String s : str) {
            numList.add(Integer.parseInt(s));
        }
        return numList;
    }

    public static void Operations(String[] ops, List<Integer> nums) {
        if (ops[0].equals("Add")) {
            nums.add(Integer.parseInt(ops[1]));
        } else if (ops[0].equals("Remove")) {
            if (Integer.parseInt(ops[1]) < nums.size() && Integer.parseInt(ops[1]) >= 0) {
                nums.remove(Integer.parseInt(ops[1]));
            } else {
                System.out.println("Invalid index");
            }

        } else if ((ops[0].equals("Shift") && ops[1].equals("right"))) {
            int rightShifts = Integer.parseInt(ops[2]);

            for (int i = 0; i < rightShifts; i++) {

                int last = nums.get(nums.size() - 1);
                for (int j = nums.size() - 1; j > 0; j--) {

                    nums.set(j, nums.get(j - 1));

                }
                nums.set(0, last);
            }


        } else if (ops[0].equals("Shift") && ops[1].equals("left")) {
            int leftShifts = Integer.parseInt(ops[2]);

            for (int i = 0; i < leftShifts; i++) {

                int first = nums.get(0);

                for (int j = 1; j < nums.size(); j++) {
                    nums.set(j - 1, nums.get(j));
                }

                nums.set(nums.size() - 1, first);


            }
        } else if (ops[0].equals("Insert")) {
            int number = Integer.parseInt(ops[1]);
            int index = Integer.parseInt(ops[2]);

            if (index >= 0 && index < nums.size()) {
                nums.add(index, number);
            }else{
                System.out.println("Invalid index");
            }

        }


    }

    public static void printList(List<Integer> ls) {
        for (int n : ls) {
            System.out.print(n + " ");
        }
    }
}
