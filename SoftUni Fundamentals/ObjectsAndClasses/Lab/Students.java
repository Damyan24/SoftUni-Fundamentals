package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        class Student{

            private String firstName;
            private String lastName;

            private int age;

            private String hometown;

            void setFirstName(String firstName){
                this.firstName = firstName;
            }

            void setLastName(String lastName){
                this.lastName = lastName;
            }

            void setAge(int age){
                this.age = age;
            }

            void setHometown(String hometown){
                this.hometown = hometown;
            }

            String getFirstName(){
                return firstName;
            }

            String getLastName(){
                return lastName;
            }

            int getAge(){
                return age;
            }

            String getHometown(){
                return hometown;
            }

            void info(){
                System.out.println(firstName + " " + lastName + " is " + age + " years old");
            }



        }

        Scanner scan = new Scanner(System.in);



        List<Student> students = new ArrayList<>();

        String info = scan.nextLine();

        while (!info.equals("end")){

            Student stud = new Student();

            String [] Students = info.split(" ");
            String firstName = Students[0];
            String  lastName = Students[1];
            int age = Integer.parseInt(Students[2]);
            String hometown = Students[3];

            stud.setFirstName(firstName);
            stud.setLastName(lastName);
            stud.setAge(age);
            stud.setHometown(hometown);

            students.add(stud);

            info = scan.nextLine();


        }

        String searchingTown = scan.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(searchingTown)) {
                student.info();
            }
        }
    }
}
