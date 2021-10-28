// pt 1 of HW

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // arraylist to store input
        ArrayList<Double> list = new ArrayList<>();

        // scanner object for scanning input
        Scanner sc = new Scanner(System.in);

        // taking input
        for(int i = 0; i < 5; i++) {
            System.out.println("Please enter number " + (i + 1));
            list.add(sc.nextDouble());
        }

        // declaring the variables with appropriate value
        double sum = 0, product = 1, largest = list.get(0), smallest = list.get(0);

        // looping through the arraylist.
        for(int i = 0; i < 5; i++) {
            sum += list.get(i); // add the element to the sum
            product *= list.get(i); // multiplying the element to product

            largest = Math.max(largest, list.get(i)); // checking whether the current element is largest
            smallest = Math.min(smallest, list.get(i)); // checking whether the current element is smallest
        }

        // printing the output.
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The largest is: " + largest);
        System.out.println("The smallest is: " + smallest);
    }
}