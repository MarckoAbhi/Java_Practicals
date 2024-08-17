public class NumberPattern {
    public static void generatePattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print i 'i's on each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after printing i 'i's
        }
    }

    public static void main(String[] args) {
        int n = 7;
        generatePattern(n);
    }
}

