package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int f=1;

        for (int i = 1; i<=n; i++){
            f = f * i;
        }
        System.out.println("factorial: " + f);
    }
}
