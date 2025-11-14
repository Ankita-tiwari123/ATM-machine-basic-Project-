# ATM-machine-basic-Project-
ATM machine basic Project using java and oops concepts to understand the basic of oops concepts 


PIN Validation

The system should have a predefined valid PIN (e.g., 1234).

Ask the user to enter the PIN.

If the entered PIN is correct, show the ATM menu.

If incorrect, display an error message and ask whether the user wants to try again or exit.

ATM Menu (after successful login)

1. Check Balance: Display the current balance.

2. Deposit Money: Allow the user to deposit an amount and update the balance.

3. Withdraw Money: Allow the user to withdraw money only if sufficient balance is available.

4. Exit: End the session and thank the user.

Balance Handling

The system should start with a default balance (e.g., ₹10,000).

All transactions (deposit/withdrawal) should update this balance during the session.

Exit Condition

The program should terminate gracefully when the user selects “Exit” or chooses not to retry after a wrong PIN.


Language: Java

Input method: Scanner class for user input

Use of:

if-else statements for PIN validation

switch-case for menu options

while loops for repeated operations

=====Input flows ======

===== Welcome to Java ATM =====
Enter your 4-digit PIN: 1234
✅ PIN Verified Successfully!

===== ATM MENU =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 1
💰 Your current balance is: ₹10000.0


Optional (for extended version):

Use of Classes & Methods for modular design

Use of Exception Handling for invalid inputs
