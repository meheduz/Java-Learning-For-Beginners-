// 5. Write a Program to Find Factorial of a Number in Java.

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 1;
        while(n!=0){
            result = n * result;
            n = n - 1;
        }
        System.out.println(result);
    }
}
