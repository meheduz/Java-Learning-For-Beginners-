import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a1;// arrat declaration 
        int[] a2 = {20,5,7,8};
        int[] a3 = new int[]{1, 2, 3};
        int[] a4 = new int[3];
        a4[0] = 1;
        a4[1] = 2;
        a4[2] = 3;
        // this is a loop, printing all element from a array
        for( int x : a2){   
            System.out.print(x + " "); 
        }
        System.out.println(a4.length);
        Arrays.sort(a2);
        // System.out.println(a2); output: [I@2133814f  prints a memory reference
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a4));

        int[][] matrix = { {1, 2, 3}, {4, 5,7} };
        int x = matrix[1][0];
        
        System.out.println(Arrays.deepToString(matrix)); // multidimensional array to string 

        // printing array elements
        for (int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[i].length; ++j) {
                System.out.println(matrix[i][j]);
            }
        }
    } 
}
