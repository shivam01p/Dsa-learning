import java.util.*;

public class pracQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1 Find average

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int avg = (a+b+c)/3;
        // System.out.println(avg);

        // Q2 Find Area of square

        // int side = sc.nextInt();
        // int aos = side*side;
        // System.out.println(aos);

        // Q3 Find total cost with gst 

        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();

        // float TC = ((pencil+pen+eraser)* 18)/100;
        // System.out.println(TC);

        // Q4 

        // int $ = 24;
        // System.out.println($);

        //Operator practice question
        
        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;

        // int exp = 4/3 * (x+34) + 9 * (a+b+c) + (3 + y * (2+a)) / (a + b * y);

        // System.out.println(exp);

        // If else practice question

        // 1st method
        // System.out.println("Enter a year");
        // int year = sc.nextInt();

        // if( year % 4 == 0 ){
        //     if( year % 100 == 0){               
        //         if( year % 400 == 0){
        //             System.out.println("Leap year");
        //         }else{
        //             System.out.println("Not a leap year");
        //         }
        //     }else{
        //         System.out.println("Leap year");
        //     }
        // }else {
        //     System.out.println("Not a Leap year");
        // }

        // 2nd method
        // System.out.println("Enter a year");
        // int year = sc.nextInt();

        // boolean x = year % 4 == 0;
        // boolean y = year % 100 != 0;
        // boolean z = (year % 100 == 0 && year % 400 == 0);

        // if(x && (y || z)){
        //     System.out.println(year + " is a leap year");
        // }else{
        //     System.out.println(year + " is not a leap year");
        // }

        //** Prints sum of ODD and EVEN number

        int even_num = 0, odd_num = 0;
        do{
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if(num%2 == 0){
                even_num += num;
                System.out.println("Even sum = " + even_num);
                System.out.println("Odd sum = " + odd_num);
            }else{
                odd_num += num;
                System.out.println("Even sum = " + even_num);
                System.out.println("Odd sum = " + odd_num);
            }
        }while(true);

    }
}
