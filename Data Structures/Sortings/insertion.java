package Sortings;

public class insertion {

    public static void insertion_sort(int arr[]){

        for(int i=1; i<arr.length; i++){

            int cur = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > cur){

                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = cur;
        }
    }
    public static void main(String[] args) {
        
        int nums[] = {5, 4, 1, 3, 2};
        insertion_sort(nums);

        int arr[] = {3, 5, 1};

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
