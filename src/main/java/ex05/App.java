/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex05;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String firstString = in.nextLine();
        int intFirst = Integer.parseInt(firstString);
        System.out.print("What is the second number? ");
        String secondString = in.nextLine();
        int intSecond = Integer.parseInt(secondString);
        int sum = intFirst + intSecond;
        int diff = intFirst - intSecond;
        int multiply = intFirst * intSecond;
        int divide = intFirst / intSecond;
        System.out.println(intFirst + " + " + intSecond + " = " + sum + "\n" + intFirst + " - " + intSecond + " = " + diff + "\n" + intFirst + " * " + intSecond + " = " + multiply + "\n" + intFirst + " / " + intSecond + " = " + divide);
    }
}
