# SwingATM
This is a group class project

## GUI / Interfaces (RR)
* Main Window : User will choose what to do. (Withdraw / Deposit / Check Balance / Exit)
* Withdraw / Deposit Window.  Same window with different text on the buttons.
* PIN Input

## Java files / Classes
  1. ATM.java (RR)
      1. Initializes GUI
  2. ATMPanel.java (RR)
      1. Builds User Instruction
      2. Builds User Input Display
      3. Builds the four button panels
  3. Account.java (A)
      1. Attributes
          1. accountNumber
          2. accountPIN
          3. accountBalance
          4. maxWithdrawal
          5. maxDeposit
          6. primaryFirstName
          7. primaryLastName
          8. primaryPrefix
          9. primaryDisplay
      2. Methods
          1. Constructor
          2. setAccountPIN
          3. setAccountBalance
          4. setMaxWithdrawal
          5. setMaxDeposit
          6. setPrimaryFirstName
          7. setPrimaryLastName
          8. setPrimaryPrefix
          9. setPrimaryDisplay
          10. getAccountPIN
          11. getAccountBalance
          12. getMaxWithdrawal
          13. getMaxDeposit
          14. getPrimaryFirstName
          15. getPrimaryLastName
          16. getPrimaryPrefix
          17. getPrimaryDisplay

## Flow
  1. PIN Request
    1. If invalid give error message.
    2. If good goto Main window.
  2. Main Window
    1. Deposit
    2. Withdraw
    3. Check Balance
    4. Exit
  3. Deposit
    1. $20
    2. $40
    3. $60
    4. Custom
  4. Withdraw
    1. $20
    2. $40
    3. $60
    4. Custom
  5. Check Balance
    1. Prints Balance
  6. Exit
    1. Goes to PIN screen
