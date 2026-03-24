package Array;

public class diagSum {

    public static int diagonal_sum(int matrix[][]){

        //Todo: Brute force approach
        int sum =0;
        // for(int r=0; r<matrix.length; r++){
        //     for(int c=0; c<matrix[0].length; c++){

        //         if(r == c){
        //             sum += matrix[r][c];
        //         }
        //         else if(r+c == matrix.length-1){
        //             sum += matrix[r][c];
        //         }
        //     }
        // }
        // return sum;

        for(int p=0; p<matrix.length; p++){

            //Primary
            sum += matrix[p][p];

            //Secondary
            if(p != matrix.length-p-1)
                sum += matrix[p][matrix.length-p-1];
        }

        return sum;
    }
    public static void main(String[] args) {
        
        int matrix[][] = {{1, 2, 3},
                          {5, 6, 7},
                          {9, 10, 11}};

        System.out.println(diagonal_sum(matrix));
    }
}
