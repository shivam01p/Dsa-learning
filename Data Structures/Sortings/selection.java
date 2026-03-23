package Sortings;

public class selection {

    public static void selection_sort(int arr[]){

        for(int turn=0; turn<arr.length-1; turn++){
            int min = turn;
            for(int comp=turn+1; comp<arr.length; comp++){
                if(arr[min] > arr[comp]){
                    min = comp;
                }
            }

            //? Swap
            int temp = arr[min];
            arr[min] = arr[turn];
            arr[turn] = temp;
        }
    }
    public static void main(String[] args) {
        
        int nums[] = {5, 4, 1, 3, 2};
        selection_sort(nums);
        
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
