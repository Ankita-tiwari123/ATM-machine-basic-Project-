package com.mycompany.atmmachinebasicproject;

public class AtmMachine {
    static double balance = 100000;
    private final int valid_Pin = 1222;
    
    public boolean checkPin(int enteredPin) {
        return enteredPin == valid_Pin;
    }

}
