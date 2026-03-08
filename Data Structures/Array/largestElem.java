package Array;
import java.util.*;

public class largestElem {

    public static int getLargest(int num[]){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++){

            if(largest < num[i])
                largest = num[i];

            if(smallest > num[i])
                smallest = num[i];

        }

        System.out.println("Smallest is: " + smallest);
        return largest;
    }
    public static void main(String args[]){

        int num[] = {1, 3, 6, 2, 5};
        System.out.println("Largest is: " +getLargest(num));

    }
}
