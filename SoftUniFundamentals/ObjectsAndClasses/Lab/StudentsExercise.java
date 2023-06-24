package SoftUniFundamentals.ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsExercise {
    public static void main(String[] args) {

        class Student{
            String name;
            double grade;

            Student(String name , double grade){
                this.name = name;
                this.grade = grade;
            }

            public String getName(){
                return name;
            }

            public double getGrade(){
                return grade;
            }

        }

        Scanner scan = new Scanner(System.in);



        int n = Integer.parseInt(scan.nextLine());

        List<Student> studs = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {


            String[] info = scan.nextLine().split(" ");

            String name = info[0] + " " + info[1];
            double score = Double.parseDouble(info[2]);

            Student stud = new Student(name, score);

            studs.add(stud);

        }

        double [] scores = new double[studs.size()] ;

        for(int i = 0 ; i < studs.size(); i++){
            scores[i] = studs.get(i).getGrade();
        }

        for(int i = 0; i < scores.length; i++){
            double max = 0;
            int index = 0;
            for(int j = i ; j < scores.length; j ++ ){
                if(scores[j] > max){
                    max = scores[j];
                    index = j;
                }
            }
            double temp = scores[i];
            scores[i] = scores[index];
            scores[index] = temp;
        }


        for(int i = 0 ; i < scores.length; i++){
            double current = scores[i];

            for(int j = 0 ; j < studs.size(); j++){
                if(studs.get(j).getGrade() == current){
                    System.out.printf("%s: %.2f\n" , studs.get(j).getName() , studs.get(j).getGrade() );
                }
            }


        }

       }





        }



