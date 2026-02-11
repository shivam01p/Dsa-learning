public class Variables {
    public static void main(String args[]){
        byte a = 127;                   //1 byte   -128 to 127
        short b = 240;                  //2 bytes
        char c = 'a';                   //2 bytes  All characters
        boolean var = true;             //1 bytes  True or Flase
        float price = 10.5f;            //4 bytes
        int d = 5;                      //4 bytes -2B to +2B
        //long                            8 bytes
        //double                          8 bytes
        String name = "Tony stark";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(var);
        System.out.println(price);
        System.out.println(d);
        System.out.println(name);


        int Num1 = 10;
        int Num2 = 20;
        int sum = Num1 + Num2;

        System.out.println(sum);
    }
}
