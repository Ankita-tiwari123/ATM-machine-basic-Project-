package com.mycompany.atmmachinebasicproject;

import java.util.Scanner;

public class menu extends AtmMachine {

    public static void menu(Scanner sc) {
        while (true) {
            System.out.println("\n======ATM Menu======");
            System.out.println("\nSelect only one option at a time ");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("\n\n Select Option: ");
        

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Current balance is :  " + balance);
                    break;
                case 2:
                    System.out.println("Enter Amount To Deposit : ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Amount Deposited SuccessFully !!");
                    break;

                case 3:
                    System.out.println("Enter the Amount to withdraw money :");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please Collect Your money : " + withdraw);
                    } else {
                        System.out.println("Insufficient Amount !!");
                    }
                    break;

                case 4:
                    System.out.println("==THANK YOU FOR USING ATM MACHINE ==");
                    return;
                default:
                    System.out.println("Invalid Choice !! Please go for valid choices !!");

            }
        }
    }

}
