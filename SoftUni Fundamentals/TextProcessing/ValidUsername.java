package TextProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ValidUsername {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String [] names = scan.nextLine().split(", ");
        List<String> goodOnes = new ArrayList<>();

        for(int i = 0 ; i < names.length; i++){
            String word = names[i].toLowerCase();
            boolean isTrue = false;
            if(word.length() >= 3 && word.length() <= 16){

                for(int j = 0 ; j < word.length(); j++ ){
                    char current = word.charAt(j);
                    if(Character.isLetterOrDigit(current) || current == '_' || current == '-'){
                        isTrue = true;
                    } else{
                        isTrue = false;
                        break;
                    }
                }
            }

            if(isTrue){
                System.out.println(names[i]);
            }
        }


    }
}
