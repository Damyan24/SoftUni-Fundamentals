package ObjectsAndClasses.Lab;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class OpinionPoll {
    public static void main(String[] args) {
        class Person{
            String name;
            int age;

            public String getName(){
                return name;
            }
            public int getAge(){
                return age;
            }

            Person(String name , int age){
                this.name = name;
                this.age=age;
            }

        }
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> people = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            String[]data = scan.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);


            Person man = new Person(name , age);

            people.add(man);
        }

        for(int i = 0 ; i < people.size(); i++){
            if(people.get(i).getAge() > 30){
                System.out.println(people.get(i).getName() + " - " + people.get(i).getAge());
            }
        }

    }
}
