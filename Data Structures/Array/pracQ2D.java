package Array;

public class pracQ2D {

    //Todo Q1: Print no. 7's present in the 2D array
    public static int countNoOf7(int matrix[][], int key){
        
        int count = 0;
        for(int row=0; row<matrix.length; row++){

            for(int col=0; col<matrix[0].length; col++){

                if(key == matrix[row][col]){
                    count++;
                }
            }
        }
        return count;
    }

    //Todo Q2: Print out the sum of numbers in 2nd row
    public static int sumOf2ndRow(int matrix[][]){

        int sum=0;
        for(int col=0; col<matrix[0].length; col++){
            sum += matrix[1][col];
        }

        return sum;
    }

    //Todo Q3: Find Transpose of matrix
    public static void transpose(int arr[][]){

        int matrix[][] = new int[arr[0].length][arr.length];
        
        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[0].length; j++){

                matrix[j][i] = arr[i][j];
            }
        }

        for(int i=0; i<matrix.length; i++){

            for(int j=0; j<matrix[0].length; j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){

        //Todo Q1: Print no. 7's present in the 2D array
        // int arr[][] = {{4, 7, 8},
        //                {8, 8, 7}};
        // System.out.println(countNoOf7(arr, 7));

        //Todo Q2: Print out the sum of numbers in 2nd row
        // int arr[][] = {{1, 4, 9},
        //                {11, 4, 3},
        //                {2, 2, 3}};
        // System.out.println(sumOf2ndRow(arr));  
        
        //Todo Q3: Find Transpose of matrix
        int arr[][] = {{11, 12, 13},
                       {21, 22, 23}};
        
        int arr1[][] = {{1, 4, 9},
                       {11, 4, 3},
                       {2, 2, 3}};
        transpose(arr1);
    }
}
