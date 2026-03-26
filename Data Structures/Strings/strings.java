package Strings;

import java.util.Scanner;

public class strings {
    public static void main(String args[]){

        char arr[] = {'a', 'b', 'c'};
        String str = "abc";
        String str2 = new String("324dafb");

        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //only one word 
        String sentence = sc.nextLine();  //Whole sentence

        String fullName = "Tony Stark";
        System.out.println(fullName.length());
    }
}
