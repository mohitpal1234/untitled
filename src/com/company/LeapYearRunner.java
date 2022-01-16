package com.company;

import java.util.Scanner;

public class LeapYearRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year:");
        int y = scanner.nextInt();

        if (y%4 == 0){
            if (y%100 == 0){
                if (y%400 == 0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
