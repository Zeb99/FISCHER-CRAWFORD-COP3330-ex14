package org.example;
import java.util.Scanner;

/**
 * Tax Calculator
 * UCF cop3330 Fall 2021 Assignment 14 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double subtotal, total = 0, tax = 0;

        System.out.println("What is the order amount? ");
        subtotal = scan.nextFloat();
        System.out.println("What is the state? ");
        String state;
        state = scan.next();


        if(state.equalsIgnoreCase("WI")){
            tax = (subtotal * 0.055);

            System.out.print("The subtotal is $" + subtotal + "\n");
            System.out.print("The tax is $" + tax + "\n");
        }
       else{
           tax = 0;
       }

        total = subtotal + tax;
        System.out.print("The total is $" + total);

    }
}
