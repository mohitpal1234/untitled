package com.company;

import java.util.Scanner;

public class LCMRunner {
    public static void main(String[] args) {
        int i= 2;
        int lcm = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first numner:");
        int n1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int n2 = scanner.nextInt();


        for (i=2; i<=n1 || i<=n2; ){

            if (n1%i == 0){
                n1 = n1/i;
            }
            if (n2%i == 0){
                n2 = n2/i;
            }
            else{
                i++;
            }
            lcm = lcm * i;
        }
        System.out.println("LCM: " + lcm);
    }
}
