package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        int temp;
        int a;
        int b;

        temp = n;
        for (a = 0 ; n > 0; n = n/10){
            b = (n%10)*(n%10)*(n%10);
            a = a + b;
        }
        if (a==temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
