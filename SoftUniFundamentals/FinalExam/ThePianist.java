package SoftUniFundamentals.FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        class Piece{

            String piece;
            String composer;
            String key;


            Piece(String piece ,String composer, String key){
                this.piece = piece;
                this.composer = composer;
                this.key = key;
            }

            public String getComposer(){
                return this.composer;
            }

            public String  getKey(){
                return this.key;
            }

            public String getPiece(){
                return this.piece;
            }

            public  void setKey(String key){
                this.key = key;
            }
        }

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Piece> pieces = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            String [] line = scan.nextLine().split("\\|");
            String piece = line[0];
            String composer = line[1];
            String key = line[2];

            Piece pc = new Piece(piece , composer ,key);
            pieces.add(pc);
        }

        String command = scan.nextLine();
        while (!command.equals("Stop")){
            String [] tokens = command.split("\\|");
            String com = tokens[0];

            if(com.equals("Add")){
                Piece pc = new Piece(tokens[1] , tokens [2] , tokens[3]);
                boolean contains = false;
                for(int i = 0 ; i < pieces.size(); i++){
                    if(pieces.get(i).getPiece().equals(tokens[1])){
                        contains = true;
                    }
                }
                if(contains){
                    System.out.println(tokens[1]+" is already in the collection!");
                }else{
                    pieces.add(pc);
                    System.out.println(tokens[1] +" by "+ tokens[2] + " in " + tokens[3] + " added to the collection!");
                }
            }else if(tokens[0].equals("Remove")){
                String pieceToRemove = tokens[1];
                boolean exist = false;
                for(int i = pieces.size() - 1 ; i >= 0 ; i--){

                    if(pieces.get(i).getPiece().equals(pieceToRemove)){
                        pieces.remove(i);
                        exist = true;
                        System.out.println("Successfully removed "+pieceToRemove+ "!");
                        break;

                    }
                }
                if(!exist){
                    System.out.println("Invalid operation! " + pieceToRemove + " does not exist in the collection.");
                }
            }else if(tokens[0].equals("ChangeKey")){
                String piece = tokens[1];
                String key = tokens[2];
                Boolean containsPiece = false;
                for(int i = 0 ; i < pieces.size() ; i++){
                    if(pieces.get(i).getPiece().equals(piece)){
                        containsPiece = true;
                        pieces.get(i).setKey(key);
                        System.out.println("Changed the key of " + piece + " to " + key+"!");
                        break;
                    }

                }
                if(!containsPiece){
                    System.out.println("Invalid operation! "+ piece+" does not exist in the collection.");
                }
            }
            command = scan.nextLine();
        }

        for(int i = 0 ; i < pieces.size(); i++){
            System.out.println(pieces.get(i).getPiece()+" -> Composer: " +pieces.get(i).getComposer()+", Key: " + pieces.get(i).getKey());
        }


    }
}
