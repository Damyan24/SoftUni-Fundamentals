package ObjectsAndClasses.Lab;
import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        class Person{
               public String name;
                public int id;
                public int age;

                Person(String name , int id , int age){
                    this.name = name;
                    this.id = id;
                    this.age = age;
                }

                String getName(){
                    return name;
                }
                int getId(){
                    return id;
                }

                int getAge(){
                    return age;
                }

                }

                Scanner scan = new Scanner(System.in);

                List<Person> people = new ArrayList<>();
                String info = scan.nextLine();
                while(!info.equals("End")){
                    String [] data = info.split(" ");

                    String name = data[0];
                    int id = Integer.parseInt(data[1]);
                    int age = Integer.parseInt(data[2]);

                    Person guy = new Person(name , id , age);

                    people.add(guy);




                    info = scan.nextLine();
                }


                for(int i = 0 ; i < people.size(); i++){
                    int index = 0;
                    int maxAge = 0;
                    for(int j = i; j < people.size(); j++){
                        if(people.get(j).getAge() > maxAge){
                            maxAge = people.get(j).getAge();
                            index = j;
                        }
                    }
                    Person temp = people.get(i);
                    people.set(i , people.get(index));
                    people.set(index , temp);
                }


                for(int i = people.size() - 1; i >= 0;i--){
                    System.out.println(people.get(i).getName() + " with ID: " + people.get(i).getId() + " is " + people.get(i).getAge() + " years old.");
                }
    }
}
