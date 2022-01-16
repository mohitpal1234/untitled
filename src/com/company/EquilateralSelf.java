package com.company;

import java.util.Scanner;

public class EquilateralSelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = scanner.nextInt();

        for (int i = 0; i<n; i++){
            for (int j = n - i; j > 1; j--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
