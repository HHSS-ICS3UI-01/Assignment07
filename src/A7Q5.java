
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import scanner
        Scanner input = new Scanner(System.in);

        //how many people
        System.out.println("How many numbers?");
        int numbers = input.nextInt();

        //create array
        int[] order = new int[numbers];

        System.out.println("Enter " + numbers + " numbers: ");

        //enter numbers
        for (int i = 0; i < order.length; i++) {
            order[i] = input.nextInt();
        }

        //sort the marks from lowest to highest
        for (int x = 0; x < order.length - 1; x++) {
            for (int y = x + 1; y < order.length; y++) {
                int temp = order[x];
                if (order[x] > order[y]) {
                    order[x] = order[y];
                    order[y] = temp;
                }
            }
        }

        //the marks in order are
        System.out.println("The marks from lowest to highest are: ");

        //print out the values
        int i = 0; 
        while (i < order.length) {
            System.out.println(order[i]);
             i++;
        }

        //calculate the median
        int half = numbers / 2;
        int last = numbers;
        if(numbers >= 0)
            last = numbers % 10;
        double median = order[half];
        double media = order[i] / 2;
        if (numbers == 2 || numbers == 4 || numbers == 6 || numbers == 8 || numbers == 0) {
            //print out the median
            System.out.println("The median is " + median);
        } else {
            //print out the media
            System.out.println("The media is " + media);
        }



    }
}
