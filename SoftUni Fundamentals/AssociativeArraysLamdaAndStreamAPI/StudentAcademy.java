package AssociativeArraysLamdaAndStreamAPI;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = Integer.parseInt(scan.nextLine());
        Map<String , List<Double>> grades = new LinkedHashMap<>();

        for(int i = 0 ; i < n ; i++){
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if(grades.get(name) == null){
                List <Double> grad = new ArrayList<>();
                grad.add(grade);
                grades.put(name , grad);
            }else{
                List<Double> grad = grades.get(name);
                grad.add(grade);
                grades.put(name , grad);
            }

        }

        for(Map.Entry<String , List<Double>> entry : grades.entrySet()){
            String name = entry.getKey();
            List<Double> grade = entry.getValue();
            double avgGrade = 0.0;

            for(int i = 0 ; i < grade.size(); i++){
                 avgGrade += grade.get(i);
            }

            avgGrade = avgGrade / grade.size();
            if(avgGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", name, avgGrade);
            }
        }

    }
}
