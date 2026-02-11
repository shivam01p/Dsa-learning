import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();        // For Word
        System.out.println(name);
        
        String fullName = sc.nextLine();  //For sentences or even full paragraph
        System.out.println(fullName);

        int num = sc.nextInt();         // For integers
        System.out.println(num);

        float fNum = sc.nextFloat();    // For Float
        System.out.println(fNum);

        //can do same for byte, short, boolean, long, double

        // Sum of a & b

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;

        System.out.println(sum);
        
    }
}
