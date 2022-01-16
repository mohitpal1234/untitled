package com.company;

import java.util.Scanner;

public class HCFRunner {
    public static void main(String[] args) {
        int HCF = 1;
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = scanner.nextInt();

        System.out.println("Enter second number");
        int n2 = scanner.nextInt();

        for (; i<n1 || i<n2; i++){
            if (n1%i == 0 && n2%i == 0) {
                HCF = i;
            }
        }
        System.out.println("HCF of the two numbers is: " + HCF);
    }
}
