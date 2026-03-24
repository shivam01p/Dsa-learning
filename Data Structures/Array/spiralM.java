package Array;

import java.util.*;

class spiralM{

    public static void spiral_Matrix(int matrix[][]){

        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){ //! Here we have to do <= because if n x m becomes odd then the middle element gets printed

            //? Top
            for(int t=startRow; t<=endCol; t++){
                System.out.print(matrix[startRow][t] + " ");
            }

            //? Right
            for(int r=startRow+1; r<=endRow; r++){
                if(startRow==endRow) break;   //! This condition help to stop printing elements which is already printed by the top loop
                System.out.print(matrix[r][endCol] + " ");
            }

            //? Bottom
            for(int b=endCol-1; b>=startCol; b--){  //! Do -- and b>=startCol not ++ and b<=startCol
                if(startCol==endCol) break;
                System.out.print(matrix[endRow][b] + " ");
            }

            //? Left
            for(int l=endRow-1; l>startRow; l--){  //! Here we will not do (>=) because it will print the whole circle instead of spiral
                if(startRow == endRow) break;
                System.out.print(matrix[l][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String args[]){

        int matrix[][] ={{1, 2, 3},
                         {5, 6, 7},
                         {9, 10, 11}};

        spiral_Matrix(matrix);
    }
}