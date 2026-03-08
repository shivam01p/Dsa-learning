package Array;
import java.util.*;

public class prefixSubArray {

    public static void prefixSum(int arr[]){

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length];
        
        prefixSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int start=0; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){

                curSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];
                if(curSum > maxSum){
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max sum= " + maxSum);
    }
    public static void main(String[] args) {

        int num[] = {1, -2, 6, -1, 3};
        prefixSum(num);
    }
}
