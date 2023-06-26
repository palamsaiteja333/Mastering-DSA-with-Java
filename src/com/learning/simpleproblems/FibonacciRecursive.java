package com.learning.simpleproblems;



public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        int numTerms = 10; // Number of Fibonacci terms to generate
        
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
