package Sortings;

public class pracQ {

    public static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubble_Sort(int arr[]) {

        int swap;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swap = 0;
            for (int comp = 0; comp < arr.length - 1 - turn; comp++) {

                if (arr[comp] < arr[comp + 1]) {
                    int temp = arr[comp];
                    arr[comp] = arr[comp + 1];
                    arr[comp + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }

    public static void selection_sort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            int max = turn;

            for (int comp = turn + 1; comp < arr.length; comp++) {
                if (arr[comp] > arr[max]) {
                    max = comp;
                }
            }

            int temp = arr[max];
            arr[max] = arr[turn];
            arr[turn] = temp;
        }
    }

    public static void insertion_sort(int arr[]) {

        for (int turn = 1; turn < arr.length; turn++) {

            int temp = arr[turn];
            int prev = turn - 1;

            while (prev >= 0 && arr[prev] < temp) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;

        }
    }

    public static void counting_sort(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int p=0; p<arr.length; p++){
            largest = Math.max(largest, arr[p]);
        }

        int count[] = new int[largest+1];
        for(int freq=0; freq<arr.length; freq++){
            count[arr[freq]]++;
        }

        int ap=arr.length-1;
        for(int cp=0; cp<count.length; cp++){
            while(count[cp] > 0){
                arr[ap] = cp;
                count[cp]--;
                ap--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bubble_Sort(arr);
        // selection_sort(arr);
        // insertion_sort(arr);
        counting_sort(arr);
        print_arr(arr);
    }
}
