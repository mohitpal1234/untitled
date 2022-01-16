package com.company;

import java.util.Scanner;

public class SwappingRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.println("Enter value of b:");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping");
        System.out.print("Value of a: " + a + "\n" + "value of b: " + b);
    }
}
