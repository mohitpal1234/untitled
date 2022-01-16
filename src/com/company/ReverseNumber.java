package com.company;

import java.io.OutputStream;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        int temp = n;
        int a;

        for (a = 0; temp > 0; temp = temp/10){
            a = a*10;
            a = a + temp % 10;
        }
        System.out.println(a);
    }
}
