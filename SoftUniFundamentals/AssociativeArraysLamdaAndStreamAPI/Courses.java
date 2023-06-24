package SoftUniFundamentals.AssociativeArraysLamdaAndStreamAPI;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String , List<String>> courses = new LinkedHashMap<>();

        String command = scan.nextLine();
        while(!command.equals("end")){
            String [] coursesAndStudents = command.split(":");

            String course = coursesAndStudents[0];

            String student = coursesAndStudents[1];

            if(courses.get(course) == null){
                List<String> students = new ArrayList<>();
                students.add(student);
                courses.put(course , students);
            }else{
                List<String> students = courses.get(course);
                students.add(student);
                courses.put(course , students);
            }




            command= scan.nextLine();
        }


        for(Map.Entry<String , List<String>> entry : courses.entrySet()){
            String course = entry.getKey().substring(0 , entry.getKey().length() - 1);
            List<String> students = entry.getValue();
            System.out.println(course +": "+students.size());
            for(int i = 0; i < students.size();i++){
                System.out.println("--" + students.get(i));
            }
        }


    }
}
