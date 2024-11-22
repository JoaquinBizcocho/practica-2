package es.iessoterohernandez.daw.endes.fibonacciMain;

import es.iessoterohernandez.daw.endes.fibonacci.Fibonacci;

public class App {
    public static void main(String[] args) {
    	 for (int i = 0; i < 10; i++) {
             System.out.println("Fibonacci de " + i + " es " + Fibonacci.fibonacci(i));
         }
    }
}
