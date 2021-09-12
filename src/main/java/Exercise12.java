/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
package exercise;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise12 {
    public static void main(String[] args){

        double principal, interestRate, dollars;
        int years;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal:");
        principal = input.nextDouble();

        System.out.println("Enter the rate of interest:");
        interestRate = input.nextDouble();
        double rate = interestRate * 0.01;

        System.out.println("Enter the number of years:");
        years = input.nextInt();


        dollars = principal * (1 + (interestRate * years));
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("After  " +  years + "years at " + interestRate + "%, the investment will be worth $" + df.format(dollars) + ".");

        
        System.exit(0);

    }
}
