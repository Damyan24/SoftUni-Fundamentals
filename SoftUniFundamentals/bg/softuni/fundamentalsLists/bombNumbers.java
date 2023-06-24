package SoftUniFundamentals.bg.softuni.fundamentalsLists;
import java.util.*;

public class bombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] nums = scan.nextLine().split(" ");
        List<Integer> numsList = arrayToList(nums);

        int bombNum = scan.nextInt();
        int power = scan.nextInt();

        while(numsList.contains(bombNum)){
            int index =numsList.indexOf(bombNum);

            List<Integer>left = new ArrayList<>();
            List<Integer>right = new ArrayList<>();


            int leftBound = Math.max(0 , index - power);
            int rightBound = Math.min(index + power , numsList.size() - 1);



            for(int i = rightBound ; i >= leftBound; i--){
                numsList.remove(i);
            }
        }


        int sum = 0;
        for(int i = 0; i < numsList.size(); i++){
            sum += numsList.get(i);
        }
        System.out.println(sum);








    }
        public static List<Integer> arrayToList (String[]wag){
            List<Integer> newWagons = new ArrayList<>();

            for (String s : wag) {
                newWagons.add(Integer.parseInt(s));
            }
            return newWagons;
        }

        public static int findIndexOf (List < Integer > nums  ,int bomb){

            return nums.indexOf(bomb);

        }
    }
