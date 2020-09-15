package com.company;

import java.util.Scanner;

public class PrimeNumbersLowerThanGiven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int readNumber = reader.nextInt();
        for (int i = readNumber; i >= 0; i--) {
            boolean primeNr = isPrime(i);
            if (primeNr) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if(number < 2){
            return false;
        }
        // nextDouble() reads the next double from the keyboard
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
