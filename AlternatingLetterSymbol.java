public class AlternatingLetterSymbol {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println("ABCDE");
            } else {
                System.out.println("####");
            }
        }
    }
}
