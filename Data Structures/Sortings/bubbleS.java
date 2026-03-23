package Sortings;

public class bubbleS {

    public static void bubbleSort(int arr[]){

        boolean isSwap;
        for(int turn=0; turn<arr.length-1; turn++){
            isSwap = false;
            for(int sw=0; sw<arr.length-1-turn; sw++){
                
                if(arr[sw] > arr[sw+1]){
                    int temp = arr[sw];
                    arr[sw] = arr[sw+1];
                    arr[sw+1] = temp;
                    isSwap = true; 
                }
            }
            if(isSwap == false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        
        int nums[] = {4, 2, 3, 1, 5};
        bubbleSort(nums);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
