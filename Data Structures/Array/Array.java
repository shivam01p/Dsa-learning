package Array;
import java.util.*;

public class Array {

    public static void update(int marks[]){

        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }

    //todo: Reverse an Array
    public static void reverse_array(int arr[], int n){

        for(int i=0; i<=(arr.length-1)/2; i++){

            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
            n--;
        }
    }

    //? Optimized version

    public static void reverse_arr(int arr[]){

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    //todo: Print pairs in array

    public static void print_pairs(int arr[]){

        int tp = 0;

        for(int i=0; i<arr.length; i++){
            
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //? Syntax for creating array 
        // int num[] = new int[50];
        // int marks[] = {5,4,3};
        // String names[] = {"Mango", "banana", "all , fruits"};
        
        //? Input of an Array (safe integer input)
        // num[0] = sc.nextInt();
        // num[1] = sc.nextInt();
        // num[2] = sc.nextInt();

        //? Updation of an Array 
        // update(marks);

        //? Output of an Array 
        // for(int i=0; i<marks.length; i++){
        //     System.out.println(marks[i]);
        // }

        //todo: Reverse an Array
        // int num[] = {3, 45, 213, 34, 53};
        // reverse_array(num, 5);
        // reverse_arr(num);

        // for(int i = 0; i<num.length; i++){
        //     System.out.print(num[i] + " ");
        // }

        //todo: Pairs in array
        int num[] = {3, 45, 213, 34, 53};
        print_pairs(num);
    }
}
