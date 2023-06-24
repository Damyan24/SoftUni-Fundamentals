package ObjectsAndClasses.Lab;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        class Article {
            private String title;
            private String content;
            private String author;


            public Article(String title , String content , String author){
                this.title = title;
                this.content = content;
                this.author = author;
            }

            public  void Edit(String content){
                this.content = content;
            }

            public void changeAuthor(String author){
                this.author = author;
            }

            public void rename(String title){
                this.title = title;
            }

            public void info(){
                System.out.println(title + " - " + content +": " + author);

            }

        }

        Scanner scan = new Scanner(System.in);

        String [] info = scan.nextLine().split(", ");

        Article article = new Article(info[0],info[1],info[2]);




        int n = Integer.parseInt(scan.nextLine());


        for(int i = 0; i < n ; i++){
            String [] command = scan.nextLine().split(": ");
            if(command[0].equals("ChangeAuthor")){
                String author = command[1];
                article.changeAuthor(author);
            }else if(command[0].equals("Edit")){
                String content = command[1];
                article.Edit(content);
            }else if(command[0].equals("Rename")){
                String name = command[1];
                article.rename(name);
            }
        }

        article.info();



    }
}
