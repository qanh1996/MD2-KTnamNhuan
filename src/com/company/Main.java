package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year=sc.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.printf("%d is a leap year", year);
                }else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            }else {
                System.out.printf("%d is a leap year", year);
            }
        }else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
