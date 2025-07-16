# Task: Advanced Abstract Class and Method Implementation

## Objective
Implement an advanced scenario using abstract classes and methods to model a simple banking system.

## Requirements

1. Create an abstract class named `Account` with:
   - An abstract method `calculateInterest()` that calculates and returns the interest amount for the account.
   - A concrete method `deposit(double amount)` that adds the specified amount to the account balance.
   - A concrete method `withdraw(double amount)` that subtracts the specified amount from the account balance if sufficient funds are available.
   - An instance variable `balance` to store the account balance.
   - An instance variable `accountNumber` to store the account number.
   - A constructor that initializes the `balance` and `accountNumber` variables.

2. Create two subclasses of `Account` called `SavingsAccount` and `CheckingAccount`:
   - `SavingsAccount` should have a constructor that takes the balance and account number as parameters and implements the `calculateInterest()` method to calculate interest at a fixed rate (e.g., 3% annually).
   - `CheckingAccount` should have a constructor that takes the balance and account number as parameters and implements the `calculateInterest()` method to calculate interest at a different fixed rate (e.g., 1% annually).

3. In the `main` method of another class, demonstrate the use of the `Account`, `SavingsAccount`, and `CheckingAccount` classes by:
   - Creating instances of `SavingsAccount` and `CheckingAccount` with initial balances and account numbers.
   - Performing deposits and withdrawals on each account.
   - Calling the `calculateInterest()` method on each account and printing the calculated interest amount.

### Knowledge requirements
- abstract class 
- abstract methods 
