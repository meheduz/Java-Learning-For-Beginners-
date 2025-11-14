// 3. Write a Program to Swap Two Numbers

import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a);
        System.out.println(b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
