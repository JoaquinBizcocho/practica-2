package es.iessoterohernandez.daw.endes.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	
	Scanner sc = new Scanner(System.in);
	
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Fibonacci de " + i + " es " + fibonacci(i));
        }
    }
}