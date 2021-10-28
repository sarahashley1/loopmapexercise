//pt. 2 of HW

import java.util.*;

public class CarDealer {
    public static void main(String[] args) {

        // key is model and makes is value.
        HashMap<String, ArrayList<Integer>> vehicles = new HashMap<String, ArrayList<Integer>>();

        // dummy data.
        vehicles.put("Rav4", new ArrayList<Integer>(Arrays.asList(2003, 2010, 2017)));
        vehicles.put("Audi A4", new ArrayList<Integer>(Arrays.asList(2008, 2020)));
        vehicles.put("Audi Q8", new ArrayList<Integer>(Collections.singletonList(2017)));
        vehicles.put("Mclaren Artura", new ArrayList<Integer>(Arrays.asList(2015, 2016, 2017)));
        vehicles.put("Lotus Exige", new ArrayList<Integer>(Arrays.asList(2015, 2017, 2020)));

        // scanner object for scanning input
        Scanner sc = new Scanner(System.in);

        // taking input
        String input = sc.nextLine();

        // check whether the vehicle is present or not.
        if(vehicles.containsKey(input)) {
            System.out.println("Oh, you're looking for a" + input + "?");

            // if present, print all the makes available for that vehicle.
            ArrayList<Integer> list = vehicles.get(input);

            for (Integer make : list) {
                System.out.println("Name: " + input + " make: " + make);
            }
        }else {
            // if not present, output it.
            System.out.println("Sorry we currently do not have any " + input + " vehicle");
        }
    }
}
