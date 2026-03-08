package Array;

public class subArray {

    public static void subArray(int arr[]){

        int ts = 0;
        for(int start=0; start<arr.length; start++){

            for(int end=start; end<arr.length; end++){

                for(int pointer=start; pointer<=end; pointer++){
                    System.out.print(arr[pointer] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray: " + ts);
    }

    public static void sumOfSubArray(int arr[]){

        int ts = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int start=0; start<arr.length; start++){

            for(int end=start; end<arr.length; end++){

                sum = 0;
                for(int pointer=start; pointer<=end; pointer++){
                    System.out.print(arr[pointer] + " ");
                    sum = sum + arr[pointer];
                }

                ts++;
                System.out.println("Sum = " + sum);

                if(sum < min){
                    min = sum;
                }
                if(sum > max){
                    max = sum;
                }
            }

            System.out.println();
        }

        System.out.println("Total subarray: " + ts);
        System.out.println("Minimum sum= " + min + " Maximum sum= " + max);
    }
    public static void main(String args[]){
        int num[] = {2, 4, 6, 8, 10};
        int arr[] = {2, 4, 5, 6};
        // subArray(arr);
        sumOfSubArray(arr);

    }
}
