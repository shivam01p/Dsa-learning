public class funPracQ {

    public static int avgOf3(int num1, int num2, int num3) {

        // int avg = (num1+num2+num3)/3;

        // return avg;
        int avg;

        return avg = (num1 + num2 + num3) / 3;
    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;
        }

        return false;
    }

    public static int numOfDigit(int num) {

        int count = 0;

        while (num > 0) {

            num /= 10;
            count++;
        }

        return count;
    }

    public static boolean isPalindrome1(int num) {
        int realNum = num;

        int pow = numOfDigit(num) - 1;
        int newNum = 0;

        while (num > 0) {
            int LD = num % 10;
            newNum = newNum + (LD * (int) Math.pow(10, pow));

            num /= 10;
            pow--;
        }

        if (realNum == newNum) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome2(int num) {
        if (num < 0)
            return false; // negatives are not palindrome
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int ld = num % 10;
            reversed = reversed * 10 + ld;
            num /= 10;
        }

        return original == reversed;
    }

    

    public static void main(String[] args) {

        // System.out.println("Avg of 3 number: " + avgOf3(4,3,4));

        // int sum = 0;
        // for(int i=0; i<=10; i++){

        // if(isEven(i)){
        // sum += i;
        // }
        // }
        // System.out.println(sum);

        // System.out.println(isPalindrome1(1234554321));
        // System.out.println(isPalindrome2(1234554321));

        System.out.println(Math.min(9,8));
        System.out.println(Math.max(9,8));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(9,3));
        // System.out.println(Math.avg(3,5,6)); No method
        System.out.println(Math.abs(-123));

    }
}
