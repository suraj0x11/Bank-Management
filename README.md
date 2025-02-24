# Bank Management System

## Overview
The **Bank Management System** is a Java-based console application that simulates the basic functionalities of a banking system. It allows users to create accounts, deposit and withdraw money, transfer funds, and view transaction details.

## Features
- **Customer Management:** Create and register new customers.
- **Account Management:** Open new accounts and manage them.
- **Transactions:** Deposit, withdraw, and transfer money between accounts.
- **Account Details:** View customer and account information.
- **Transaction History:** Keep track of past transactions.
- **Multi-Bank Support:** Includes support for Bank of India (BOI), Bank of Baroda (BOB), and Punjab National Bank (PNB).

## Technologies Used
- **Java** (Core Java, OOP concepts)
- **Java Scanner** (for user input handling)
- **Java Collections** (for managing customer data)

## How to Run the Project
1. **Install Java** (Make sure Java is installed on your system)
2. **Clone the Repository**
   ```sh
   git clone <repository-url>
   ```
3. **Navigate to the Project Directory**
   ```sh
   cd Bank-Management-System
   ```
4. **Compile and Run the Program**
   ```sh
   javac welcom.java
   java welcom
   ```

## Class Structure
### `Welcome_Bank (Interface)`
Defines methods for banking operations:
- `create_new()`
- `OpenNewAccount()`
- `DepositMoney()`
- `WithdrawMoney()`
- `TransferMoney()`
- `ViewAccountDetails()`
- `ViewTransactionHistory()`
- `Exit()`

### `Customer (Class)`
Handles customer-related operations such as setting and retrieving customer information and managing transactions.

### `Boi, Bob, Pnb (Classes)`
Each class implements `Welcome_Bank` and represents a different bank with similar functionalities.

### `welcom (Main Class)`
- Displays the welcome screen.
- Allows users to select a bank.
- Navigates through the banking operations.

## Usage
1. Run the program.
2. Select a bank from the available options.
3. Choose operations like account creation, deposit, withdrawal, or fund transfer.
4. Follow on-screen prompts to interact with the system.

## Future Enhancements
- Implement a database for persistent data storage.
- Add GUI support for better user experience.
- Introduce authentication for secure transactions.

## Contributors
- **Suraj Kumar Singh** (Developer)

## License
This project is open-source and free to use under the **MIT License**.

