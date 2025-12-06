// 5. Write a Program to Find Factorial of a Number in Java.

import java.util.Scanner;

public class fact{
    public static int fact(int n){
        int result = 1;
        while (n!=0){
            result = result * n;
            n = n - 1;
        }
        return result;

    } // User-defined method to calculate factorial
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int n = in.nextInt();
        int factorial = fact(n); // calling method here
        System.out.println("Factorial is : "+ factorial); 
    }
}
