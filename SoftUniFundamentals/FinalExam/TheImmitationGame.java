package SoftUniFundamentals.FinalExam;

import java.util.Scanner;

public class TheImmitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String encrypted = scan.nextLine();
        StringBuilder  result = new StringBuilder();
        result.append(encrypted);
        String command = scan.nextLine();

        while (!command.equals("Decode")){
            String [] info = command.split("\\|");

            if(info[0].equals("Insert")){
                result.insert(Integer.parseInt(info[1]),info[2]);
            }else  if(info[0].equals("ChangeAll")){
                for(int i = 0 ; i < result.length(); i++){
                    char currentChar = info[1].charAt(0);
                    char newChar = info[2].charAt(0);
                    if(result.charAt(i) == currentChar){
                        result.setCharAt(i , newChar);
                    }
                }

            }else {
                int n = Integer.parseInt(info[1]);
                String subString = result.substring(0 , n );
                result.append(subString);
                result.delete(0 ,  n  );
            }


            command = scan.nextLine();
        }
        System.out.println("The decrypted message is: "+result);
    }
}
