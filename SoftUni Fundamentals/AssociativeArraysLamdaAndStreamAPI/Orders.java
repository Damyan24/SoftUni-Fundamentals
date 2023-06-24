package AssociativeArraysLamdaAndStreamAPI;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String , List<Double>> orders = new LinkedHashMap<>();
        String order = scan.nextLine();
        
        while(!order.equals("buy")) {
            String[] info = order.split(" ");

            String product = info[0];
            Double price = Double.parseDouble(info[1]);
            Double quantity = Double.parseDouble(info[2]);

            if (orders.get(product) == null) {
                List<Double> prod = new ArrayList<>();
                prod.add(price);
                prod.add(quantity);
                orders.put(product, prod);
            } else {
                List<Double> existing = orders.get(product);
                existing.set(0, price);
                Double currentQuantity = existing.get(1);
                existing.set(1, currentQuantity + quantity);
            }


            order = scan.nextLine();
        }

        for(Map.Entry<String , List<Double>> entry : orders.entrySet()){
            Double total = entry.getValue().get(0) * entry.getValue().get(1);

            System.out.printf("%s -> %.2f%n",entry.getKey(),total);


        }
    }
}
