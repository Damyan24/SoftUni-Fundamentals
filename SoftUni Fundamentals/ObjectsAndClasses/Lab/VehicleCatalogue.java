package ObjectsAndClasses.Lab;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class VehicleCatalogue {
    public static void main(String[] args) {
        class Vehicle{
            String type;
            String model;
            String color;
            int horsepower;

            Vehicle(String type, String model , String color , int horsepower){
                this.type = type;
                this.model = model;
                this.color = color;
                this.horsepower = horsepower;
            }

            String getType(){
                return type;
            }

            String getModel(){
                return model;
            }

            String getColor(){
                return color;
            }

            int getHorsepower(){
                return horsepower;
            }
        }
        Scanner scan = new Scanner(System.in);

            List<Vehicle>allVehicles = new ArrayList<>();

           String  command = scan.nextLine();

           while (!command.equals("End")){

               String [] info = command.split(" ");

               String type = info[0];
               String model = info[1];
               String color = info[2];
               int horsepower = Integer.parseInt(info[3]);

               Vehicle brum = new Vehicle(type , model , color , horsepower);

               allVehicles.add(brum);

               command = scan.nextLine();
           }


           String models = scan.nextLine();
           while (!models.equals("Close the Catalogue")) {

               for (int i = 0; i < allVehicles.size(); i++) {
                   if (allVehicles.get(i).getModel().equals(models)) {
                       String firstLetter = allVehicles.get(i).getType().substring(0 , 1).toUpperCase();
                       String rest = allVehicles.get(i).getType().substring(1).toLowerCase();
                       String type = firstLetter + rest;
                       System.out.println("Type: " + type);
                       System.out.println("Model: " + allVehicles.get(i).getModel());
                       System.out.println("Color: " + allVehicles.get(i).getColor());
                       System.out.println("Horsepower: " + allVehicles.get(i).getHorsepower());


                       models = scan.nextLine();
                   }
               }
           }


           int carsHp = 0;
           int carsCount = 0;
           int trucksHp = 0;
           int trucksCount = 0;

           for(int i = 0 ; i < allVehicles.size(); i++){
               if(allVehicles.get(i).getType().equals("car")){
                   carsHp += allVehicles.get(i).getHorsepower();
                   carsCount++;
               }else{
                   trucksHp += allVehicles.get(i).getHorsepower();
                   trucksCount++;
               }
           }

           double carsAverage;
           double trucksAverage;

            if(carsCount != 0) {
                 carsAverage = (double) carsHp / carsCount;
            }else{
                 carsAverage = 0.00;
            }
            if(trucksCount != 0) {
                 trucksAverage = (double) trucksHp / trucksCount;
            }else {
                 trucksAverage = 0.00;
            }

        System.out.printf("Cars have average horsepower of: %.2f.\n" , carsAverage);
        System.out.printf("Trucks have average horsepower of: %.2f." , trucksAverage);




    }
}
