package SoftUniFundamentals.ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        class Song{
           private String typeList ;
            private String name ;
            private String time ;


            public String getTypeList(){
                return typeList;
            }

            public String getName(){
                return name;
            }

            public String getTime(){
                return time;
            }

            public void SetTypeList(String typeList){
                this.typeList = typeList;
            }

            public void SetName(String name){
                this.name = name;
            }

            public void SetTime(String time){
                this.time = time;
            }


        }

        int n = scan.nextInt();
        scan.nextLine();

        List<Song> songs = new ArrayList<>();

        for(int i = 0; i < n; i++){

            String info = scan.nextLine();
            String [] data = info.split("_");



           String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();

            song.SetTypeList(data[0]);
            song.SetName(data[1]);
            song.SetTime(data[2]);

            songs.add(song);

        }

        String type = scan.nextLine();

        if(type.equals("all")){
            for(int i = 0; i < songs.size(); i++){
                String name = songs.get(i).getName();
                System.out.println(name);
            }
        }else{
            for(int i = 0 ;  i < songs.size(); i++){
                if(songs.get(i).getTypeList().equals(type)){
                    System.out.println(songs.get(i).getName());
                }
            }
        }

    }
}
