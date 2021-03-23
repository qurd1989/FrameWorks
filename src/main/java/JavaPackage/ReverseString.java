package JavaPackage;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        String s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        s=sc.nextLine();

        System.out.print("Reversed String ");

        for (int i = s.length(); i>0; --i){

            System.out.print(s.charAt(i-1));
        }

    }
}
