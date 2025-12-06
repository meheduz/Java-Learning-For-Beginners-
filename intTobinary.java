// 4. Write a Java Program to convert Integer numbers and Binary numbers.
import java.util.Scanner;

public class intTobinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result =" ";
        while(n>0){
            int rem= n%2;
            result = rem + result;
            n = n/2;
        }
        System.out.println(result);
    }
    
}
