package Array;

public class trappedWater {

    static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 2)
            return true;

        boolean nonDecreasing = true; // ascending (allows equals)
        boolean nonIncreasing = true; // descending (allows equals)

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                nonDecreasing = false;
            if (arr[i] > arr[i - 1])
                nonIncreasing = false;

            if (!nonDecreasing && !nonIncreasing)
                return false;
        }

        return true;
    }

    public static int trapped_Water(int arr[]) {

        if (arr.length < 2) {        //? Checking the length of an array (Must be >2)

            return -1;
        } else if (isSorted(arr)) {  //? Checking if array is sorted

            return -1;
        } else {

            int n = arr.length;
            int trappedWater = 0;
            //? Calculate left Max bound
            int leftMax[] = new int[n];
            
            leftMax[0] = arr[0];
            for(int lp=1; lp<n; lp++){
                leftMax[lp] = Math.max(arr[lp], leftMax[lp-1]);
            }

            //? Calculate Right Max bound
            int rightMax[] = new int[n];

            rightMax[n-1] = arr[n-1];
            for (int rp = n-2; rp >= 0; rp--) {
                rightMax[rp] = Math.max(arr[rp], rightMax[rp+1]);
            }

            //? Calculate trapped water

            for(int cb=0; cb<arr.length; cb++){
                
                int waterLevel = Math.min(leftMax[cb], rightMax[cb]);

                trappedWater += waterLevel - arr[cb];
            }
            return trappedWater;
        }
        
    }

    public static void main(String[] args) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapped_Water(height));
    }
}
