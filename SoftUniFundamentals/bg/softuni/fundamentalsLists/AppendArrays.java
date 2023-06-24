package SoftUniFundamentals.bg.softuni.fundamentalsLists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nums = scan.nextLine().split("|");

        List<String> arrays = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!nums[i].equals(" ")) {
                arrays.add(nums[i]);
            }
        }

        List<Integer> indexes = new ArrayList<>();


        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i).equals("|")) {
                indexes.add(i);
            }
        }

        List<String> result = new ArrayList<>();


      while (indexes.size() != 0){

          int currentIndex = indexes.get(indexes.size() - 1);


          for(int i = currentIndex + 1 ; i < arrays.size(); i++){
              result.add(arrays.get(i));
          }

          for(int i = arrays.size() - 1 ; i >= currentIndex; i--){
              arrays.remove(currentIndex);
          }

          indexes.remove(indexes.size() - 1);
      }


        result.addAll(arrays);

       for(int i = 0 ; i < result.size(); i++){
           if(i != result.size() - 1){
               System.out.print(result.get(i) + " ");
           }else{
               System.out.print(result.get(i));
           }
       }
    }

    }
