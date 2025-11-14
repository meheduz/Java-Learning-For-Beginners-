
import java.util.Scanner;

public class MaxNum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // taking int a as input
        int b = in.nextInt();// taking int b as input
        int max = (a > b) ? a : b;// ternary operator
        System.out.println(max); // printing max number 
    }
}