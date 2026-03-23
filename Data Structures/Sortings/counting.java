package Sortings;

public class counting {

    public static void counting_Sort(int arr[]){

        //Todo: first find largest value
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //Todo: Create counting arr which counts frequency
        int count[] = new int[largest+1];
        for(int frq=0; frq<arr.length; frq++){
            count[arr[frq]]++;
        }

        //Todo: Sort arr according to the frequency
        int ap=0; 
        for(int cp=0; cp<count.length; cp++){
            while(count[cp]>0){
                arr[ap] = cp;
                ap++;
                count[cp]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        counting_Sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
