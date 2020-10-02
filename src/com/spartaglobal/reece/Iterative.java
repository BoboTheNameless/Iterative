package com.spartaglobal.reece;

public class Iterative {
    public int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }
    public int fibonacci(int n) {
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;
        for (int i = 0; i < n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
        }
        return fib;
    }
}
