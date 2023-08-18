public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci ke-" + n + ": " + fibonacci(n));
    }

        public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
