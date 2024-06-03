package Recursion1;

public class FibonacciRecursion {
	// Recursive method to calculate Fibonacci number at a given position
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 1)
        {
            return n;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    

    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");

        // Loop to print the Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
