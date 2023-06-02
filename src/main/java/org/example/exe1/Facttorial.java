package org.example.exe1;

public class Facttorial {
    public static void main(String[] args) {
        int n = 5, mul = 1;
        for (int i = 1; i <= n; i++) {
            mul = mul * i;
        }
        System.out.println("Factorial of " + n + " :" + mul);
    }
}
