public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
