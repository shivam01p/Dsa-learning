package Searches;

public class binSearch {


    //? Here Array must be sorted. (The start will be 0 and end will be array.length-1).

    public static int binary_search(int arr[], int key){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            
            int mid = (start+end)/2;

            if(key == arr[mid]){
                return mid;
            }
            else if(key > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        int num[] = {4, 7, 10, 15, 19, 21, 27};
        
        int index = binary_search(num, 27);
        System.out.println(index);
    }
}
