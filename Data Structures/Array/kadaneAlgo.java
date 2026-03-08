package Array;

public class kadaneAlgo {

    public static void kadane_algo(int arr[]) {

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        boolean isNegative = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                isNegative = false;
                break;
            }
        }

        if (isNegative) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                }
            }
        } else {

            for (int i = 0; i < arr.length; i++) {

                curSum = curSum + arr[i];
                if (curSum < 0) {
                    curSum = 0;
                }
                if (curSum > maxSum) {
                    maxSum = curSum;
                }
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int arr[] = { -9, -4, -1, -2, -3 };
        kadane_algo(arr);
    }
}
