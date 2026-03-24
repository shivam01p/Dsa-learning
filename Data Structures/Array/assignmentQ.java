package Array;

public class assignmentQ {

    // Todo: Q1
    public static boolean isDuplicate(int arr[]) {

        for (int FAP = 0; FAP < arr.length; FAP++) {

            for (int SAP = FAP + 1; SAP < arr.length; SAP++) {

                if (arr[FAP] == arr[SAP]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Todo: Q2

    // Todo: Q3
    public static int maxProfit(int arr[]) {

        int buyingPrice = arr[0];
        int maxProfit = 0;

        for (int p = 1; p < arr.length; p++) {

            if (arr[p] > buyingPrice) {

                int profit = arr[p] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            
            } else {

                buyingPrice = arr[p];
            
            }
        }
        return maxProfit;
    }

    // Todo: Q4
    public static int totalWater(int arr[]){

        int totalWater = 0;
        int n = arr.length;
        
        // Calculating left side max
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int Lp=1; Lp<n; Lp++){

            leftMax[Lp] = Math.max(arr[Lp], leftMax[Lp-1]);

        }

        // Calculating Right side max
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int Rp=n-2; Rp>=0; Rp--){

            rightMax[Rp] = Math.max(arr[Rp], rightMax[Rp+1]);

        }

        for(int p=0; p<n; p++){

            int waterLevel = Math.min(leftMax[p], rightMax[p]);
            totalWater += waterLevel - arr[p];
        }

        return totalWater;
    }

    // Todo: Q5
    public static void triplet(int arr[]){

        for(int i=0; i<arr.length; i++){
            
            for(int j=0; j<arr.length; j++){

                for(int k=0; k<arr.length; k++){

                    if(arr[i]+arr[j]+arr[k] == 0 && (i!=j) && (i!=k) && (j!=k)){
                        System.out.print("[" + arr[i] + arr[j] + arr[k] + "] ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        // Todo: Q1
        // int nums[] = { 4, 5, 6, 7, 0, 1, 4 };
        // System.out.println(isDuplicate(nums));
        
        // Todo: Q3
        // int prices[] = {7, 6, 4, 3 ,1};
        // System.out.println(maxProfit(prices));
    
        // Todo: Q4
        // int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // int height[] = {4, 2, 0, 3, 2, 5};
        // System.out.println(totalWater(height));
    
        // Todo: Q5
        int nums[] = {-1, 0, 1, 2, -1, -4};
        triplet(nums);
    }
}
