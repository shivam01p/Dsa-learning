package Array;

public class sortedM {

    public static boolean sorted_matrix(int matrix [][] , int key){

        //Todo: 1st approach
        // int row = 0;
        // int col = matrix[0].length-1;

        // while(row < matrix.length && col >= 0){

        //     if(key == matrix[row][col]){
        //         System.out.println("Key found at (" + row + "," + col + ")");
        //         return true;
        //     }
        //     else if(key > matrix[row][col]){
        //         row++;
        //     }
        //     else{
        //         col--;
        //     }
        // }
        // System.out.println("key not found!");
        // return false;

        int row = matrix.length-1;
        int col = 0;

        while(row >= 0 && col < matrix[0].length){

            if(key == matrix[row][col]){
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            }
            else if(key > matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }

        System.out.println("Key not found!");
        return false;
    }
    public static void main(String args[]){

        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};

        sorted_matrix(matrix, 30);
    }
}
