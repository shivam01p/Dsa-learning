import java.util.*;

public class function {

    public static int changeA(int a){
        a = 19;
        return a;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a + "b: " + b);
    }

    public static int factorial(int num){
        int fact = 1;

        for(int i = 1; i<=num; i++){
            fact *= i;
        }

        return fact;
    }

    public static int binCoffe(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoffe = fact_n/ (fact_r * fact_nmr);

        return binCoffe;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(int a, int b, int c){
        float sum = a + b + c;
        
        return sum;
    }

    public static boolean isPrime(int num){

        for(int divider = 2; divider <= Math.sqrt(num); divider++){

            if( num % divider == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void rangePrime(int n){

        
        for(int num = 2; num <= n; num++){
            
            boolean isPrime = true;

            for(int divider = 2; divider <= Math.sqrt(num); divider++){
                
                if(num % divider == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.println(num);
            }
        }
    }

    public static void rngPrime(int range){

        for(int num = 2; num <= range; num ++){
            
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println(changeA(90));

        // swap(7, 97);
        
        // System.out.println(factorial(5));

        // System.out.println(binCoffe(5, 2));

        // System.out.println(sum(1, 2, 3));

        // rangePrime(10);

        rngPrime(20);
    }
}
