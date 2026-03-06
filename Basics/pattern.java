public class pattern {

    public static void inv_pyr_numbers(int totRow){

        for(int row = 1; row <= totRow; row++){

            for(int col = 1; col <= totRow-row+1; col++){

                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    public static void triangle_0_1(int totRow){

        for(int row = 1; row <= totRow; row++){

            for(int col = 1; col <= row; col++){

                if((row+col)%2 == 0){                     //Here + and - both works
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_patternM1(int totRow){

        int totSpace = (totRow*2)-2; //!

        for(int row = 1; row <= totRow; row++){

            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            for(int space = 0 ; space < totSpace; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            totSpace-=2;
            System.out.println();
        }

        totSpace = 0; //!

        for(int row = 1; row <= totRow; row++){

            for(int col = 1; col <= totRow-row+1; col++){
                System.out.print("*");
            }
            for(int space = 0; space < totSpace; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= totRow-row+1; col++){
                System.out.print("*");
            }
            totSpace+=2;
            System.out.println();
        }
    }

    public static void butterfly_patternM2(int totRow){

        //* 1st half */

        for(int row = 1; row <= totRow; row++){

            for(int col = 1; col<=row; col++){
                System.out.print("*");
            }

            for(int space=0; space<2*(totRow-row); space++){
                System.out.print(" ");
            }

            for(int col = 1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row = totRow; row>0; row--){

            for(int col = 1; col<=row; col++){
                System.out.print("*");
            }

            for(int space=0; space<2*(totRow-row); space++){
                System.out.print(" ");
            }

            for(int col = 1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        // inv_pyr_numbers(5);
        // triangle_0_1(5);
        // butterfly_patternM1(8);
        butterfly_patternM2(8);
    }
}
