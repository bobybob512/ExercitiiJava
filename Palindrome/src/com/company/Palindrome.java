package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int readnumber = reader.nextInt();
        String number = "";
        int copyReadNumber = readnumber;
        while (readnumber % 10 != 0) {
            number += readnumber % 10;
            readnumber = readnumber / 10;

        }

        if (copyReadNumber == Integer.parseInt(number)) {
            System.out.println(copyReadNumber + " is a Palindrome");
        } else
            System.out.println(copyReadNumber + " is a NOT a Palindrome");
    }
}
