package Searches;
public class linearSearch {

    public static int linear_Search(int arr[], int key){

        for(int i=0; i<arr.length; i++){

            if(arr[i] == key)
                return i;
            
        }
        return -1;
    }

    public static int find_string(String arr[], String key){

        for(int i=0; i<arr.length; i++){

            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){

        int num[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 14;

        int index = linear_Search(num, key);
        if(index == -1){
            System.out.println("Not Found!");
        }else{
            System.out.println("Index is: " + index);
        }

        String menu[] = {"Dosa" , "Samosa", "Mango" , "Fruti"};
        String key1 = "Dabeli";

        int index1 = find_string(menu, key1);
        if(index1 == -1){
            System.out.println("Not Found!");
        }else{
            System.out.println("Index is: " + index1);
        }
    }
}
