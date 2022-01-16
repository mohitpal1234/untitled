package com.company;

import java.util.Scanner;

public class PrimeNumberRunner {
    public static void main(String[] args) {
        int count = 0;
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        for (i = 1; i <= n ; ++i){
            count = 0;
            for (int j =1; j<=i; ++j){
                if (i%j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(i);
            }
        }
    }
}
