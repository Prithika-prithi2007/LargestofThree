package com.example;
public class App {
    public int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("The Largest number is: " + app.largest(10, 25, 15));
    }
}
