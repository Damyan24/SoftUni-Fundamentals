package SoftUniFundamentals.AssociativeArraysLamdaAndStreamAPI;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {

        Map<String , List<String>> sides = new LinkedHashMap<>();
        Scanner scan = new Scanner(System.in);
        String info = scan.nextLine();


        while (!info.equals("Lumpawaroo")){
            String [] tokens = info.split(" ");

            String delimeter = tokens[1];
            if (delimeter.equals("|")){
                String forceSide = tokens[0];
                String forceUser = tokens[2];

                boolean isForceSideExisting = false;
                if(sides.get(forceSide) != null){
                    isForceSideExisting = true;
                }

                boolean isForceUserExisting = false;

                for (Map.Entry<String , List<String >> entry : sides.entrySet()){
                    List<String> users = entry.getValue();
                    if(users.contains(forceUser)){
                        isForceUserExisting = true;
                    }
                }


                if(!isForceSideExisting && !isForceUserExisting){
                    List<String> ForceUsers = new ArrayList<>();
                    ForceUsers.add(forceUser);
                    sides.put(forceSide ,ForceUsers );
                }


                if(isForceSideExisting && !isForceUserExisting){
                    List<String> current = sides.get(forceSide);
                    current.add(forceUser);
                    sides.put(forceSide , current);
                }

            }else if (delimeter.equals("->")){
                String name = tokens[0];
                String side = tokens[2];

                boolean isForceUser = false;
                boolean isForceSide = false;

                if(sides.containsKey(side)){
                    isForceSide = true;
                }

                for (Map.Entry<String , List<String >> entry : sides.entrySet()){
                    List<String> users = entry.getValue();
                    if(users.contains(name)){
                        isForceUser = true;
                        users.remove(name);
                    }

                }

                if(isForceSide){
                    List<String> current = sides.get(side);
                    current.add(name);
                    sides.put(side , current);
                    System.out.println(name + " joins the " + side + " side!");
                }

                if(!isForceSide){
                    List<String> newList = new ArrayList<>();
                    newList.add(name);
                    sides.put(side , newList);
                    System.out.println(name + " joins the " + side + " side!");
                }

            }



            info = scan.nextLine();
        }







        for( Map.Entry<String , List<String>> entry : sides.entrySet()) {
            String side = entry.getKey();
            int members = entry.getValue().size();
            if (members != 0) {
                System.out.println("Side: " + side + ", Members: " + members);
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.println("! " + entry.getValue().get(i));
                }
            }
        }

    }
}
