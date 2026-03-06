import java.util.*;

public class binConv {

    public static void BtoD(int binNum){

        int mynum = binNum;
        int decNum = 0;
        int lastDigit;
        int pow = 0; 

        while(binNum > 0){

            lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            binNum /= 10;
            pow++;
        }

        System.out.println("The Decimal num of " + mynum + " is: " + decNum);
    }

    public static void DtoB(int decNum){

        int mynum = decNum;
        int rem;
        int binNum = 0;
        int pow = 0;

        while(decNum > 0){

            rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            decNum /= 2;
            pow++;
        }

        System.out.println("The binary num of "+ mynum +  " is: "+ binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BtoD(1000);
        DtoB(8);
        
    }
}
