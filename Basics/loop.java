import java.util.*;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //** Reverse a number

        int n = sc.nextInt();
        int rev_num = 0;
        
        int j = 0; 
        while(n!=0){
            rev_num = n%10;
            System.out.println(rev_num);
            n/=10;
        }

        for(int i=0; n!=0; i++){
            int lastDigit = n%10;
            rev_num = (rev_num * 10)+lastDigit;
            System.out.print(rev_num);
            n/=10;
        }

        //** Keep entering number until it is multiple of 10 
        
        do{

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if(num%10 == 0) 
                continue;

            System.out.println(num);

        }while(true);

    }
}
