package com.company;

import java.util.Scanner;

public class LargestRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int n1 = scanner.nextInt();

        System.out.println("Enter Second Number:");
        int n2 = scanner.nextInt();

        System.out.println("Enter Third Number:");
        int n3 = scanner.nextInt();

        if(n1>n2){
            if(n1>n3){
                System.out.println(n1 + " is the greatest.");
            }
            else{
                System.out.println(n3 + " is the greatest.");
            }
        }
        else{
            if(n2 > n3){
                System.out.println(n2 + " is the greatest.");
            }
            else{
                System.out.println(n3 + " is the greatest.");
            }
        }
    }
}
