public class RepeatingPairLetter {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char ch = (char) ('A' + (i + j) % 26);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
