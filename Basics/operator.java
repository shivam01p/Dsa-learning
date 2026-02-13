public class operator {
    public static void main(String[] args) {
        
        int A = 10;
        int B = 5;

        //** Arithmetic Operators ** 

        //Binary Operators

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

        //Unary Operators

        System.out.println(B = A++);
        System.out.println(B = ++A);
        System.out.println(B = A--);
        System.out.println(B = --A);

        //** Relational Operator

        System.out.println(A == B);
        System.out.println(A != B);
        System.out.println(A > B);
        System.out.println(A < B);
        System.out.println(A <= B);
        System.out.println(A >= B);

        //** Logical Operator

        System.out.println((3>2) && (2<5));
        System.out.println((3>2) || (5<2));
        System.out.println( !(3>2) );

    }
}
