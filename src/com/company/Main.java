package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        float a = scanner.nextFloat();

        System.out.println("Enter second number: ");
        float b = scanner.nextFloat();

        float c = a * b;
        System.out.println(c);


    }
}
