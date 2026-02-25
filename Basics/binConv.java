import java.util.*;

public class binConv {

    public static void DtoB(int decNum){

        int rem;
        int binNum = 0;
        int pow = 0;

        while(decNum > 0){

            rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            decNum /= 2;
            pow++;
        }

        System.out.println("The binary num is: "+ binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DtoB(8);


        for(int i =0; i<8; i++){

        }
        
    }
}
