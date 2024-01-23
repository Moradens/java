public class Fibo {
        public static void main(String[] args) {
            int n = 512;

            long[] fibonacciNumbers = new long[n];
            fibonacciNumbers[0] = 0;
            fibonacciNumbers[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }

            System.out.println("Fibonacciho posloupnost do " + n + ". čísla:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciNumbers[i] + " ");
            }
        }
}