
package com.mycompany.atmmachinebasicproject;

import java.util.Scanner;

public class AtmMachineBasicProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AtmMachine atm = new AtmMachine();
        
        System.out.println("===== WELCOME TO ATM MACHINE ======");
        
        
        while(true){
            System.out.println("Enter Your 4-didgit Pin number : \n");
            int enteredPin = sc.nextInt();
            
            if(atm.checkPin(enteredPin)){
                System.out.println("PIN Verified Successfully ");
                menu.menu(sc);
                System.out.println("Select from given options ");
                break;
            }
            else{
                System.out.println("Wrong PIN entered !!");
                System.out.println("Do You want to try Again ? (yes/No)");
                String choice =sc.next();
                
                if(choice.equalsIgnoreCase("no")){
                    System.out.println("Thank You for using ATM !");
                    break;
                }
            }
        }
    }
}
