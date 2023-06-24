package AssociativeArraysLamdaAndStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AminerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        Map<String, Integer> materials = new LinkedHashMap<>();
        while (!command.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());

            if(materials.get(command) == null){
                materials.put(command , quantity);
            }else{
                materials.put(command , materials.get(command) + quantity);
            }

            command = scan.nextLine();

        }

        for(Map.Entry<String , Integer> entry  : materials.entrySet() ){
            System.out.println(entry.getKey() + " -> " + entry.getValue() );
        }

    }

}
