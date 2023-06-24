package AssociativeArraysLamdaAndStreamAPI;

import java.util.*;

public class CompanyUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

        Map<String , List<String>> firms = new LinkedHashMap<>();

        while (!command.equals("End")){
            String [] info = command.split("->");
            String firm = info[0];
            String id = info[1];

            if(firms.get(firm) == null){
                List<String> ids = new ArrayList<>();
                ids.add(id);
                firms.put(firm , ids);
            } else{
                List<String> currentIds = firms.get(firm);
                if(!currentIds.contains(id))
                    currentIds.add(id);
                firms.put(firm , currentIds);
            }



            command = scan.nextLine();
        }
        for(Map.Entry<String , List<String>> entry : firms.entrySet() ){
            System.out.println(entry.getKey());
            List <String> ids = entry.getValue();
            for(int i = 0 ; i < ids.size(); i++){
                System.out.println("--" + ids.get(i));
            }
        }
    }
}
