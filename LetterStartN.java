public class LetterStartN {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }
    }
}
