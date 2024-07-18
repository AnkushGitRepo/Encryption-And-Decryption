# Encryption & Decryption System

Welcome to the Encryption & Decryption System! This system allows users to securely encrypt and decrypt messages using a predefined set of symbol mappings.

## Features

- **User Authentication**: Users must log in with a valid ID and password.
- **Message Encryption**: Convert your plain text messages into an encrypted format.
- **Message Decryption**: Convert encrypted messages back into plain text.
- **Simple Console Interface**: Easy-to-use console interface for entering messages and viewing results.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A terminal or command prompt to run the application.

### Running the Application

1. **Clone the repository**:
    ```bash
    git clone https://github.com/YourGitHubUsername/EncryptionDecryptionSystem.git
    ```

2. **Navigate to the project directory**:
    ```bash
    cd EncryptionDecryptionSystem
    ```

3. **Compile the application**:
    ```bash
    javac EncyptionDecryption.java
    ```

4. **Run the application**:
    ```bash
    java EncyptionDecryption
    ```

## Usage

1. **Welcome Screen**:
    - The application starts with a welcome message.
    - Users are prompted to enter their ID.

2. **User Authentication**:
    - Enter your ID and password to log in.
    - If the ID or password is incorrect, you will be prompted to try again.

3. **Main Menu**:
    - After successful login, you will see the following options:
      1. Encrypt a message.
      2. Decrypt a message.
      3. Exit the program.

4. **Encrypting a Message**:
    - Select option 1 from the main menu.
    - Enter the message you want to encrypt.
    - The encrypted message will be displayed.

5. **Decrypting a Message**:
    - Select option 2 from the main menu.
    - Enter the message you want to decrypt.
    - The decrypted message will be displayed.

6. **Exiting the Program**:
    - Select option 3 to exit the program.

## Implementation Details

### Classes

- **EncyptionDecryption**: This class contains the `main` method and handles user authentication.
- **BackendWork**: This class contains methods for encryption, decryption, and displaying options to the user.

### Methods

- `wrongPass(int count)`: Checks the number of incorrect password attempts.
- `wrongID(int count)`: Checks the number of incorrect ID attempts.
- `displayOptions()`: Displays the main menu and handles user choices.
- `getEncryptedValue(String toEncryptMessage)`: Encrypts the given message.
- `getDecryptedValue(String toDecryptMessage)`: Decrypts the given message.
- `getEncryptedCodes(char ch)`: Returns the encrypted symbol for a given character.
- `getDecryptedCodes(char ch)`: Returns the decrypted character for a given symbol.

### Symbol Mapping

The system uses a predefined 2D array `symbols` for mapping characters to their encrypted symbols and vice versa. This array is used in both encryption and decryption processes.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

## Contact

For any questions or suggestions, please contact:

- **Your Name**: [Your Email](mailto:ankushgupta1806@gmail.com)
- **GitHub**: [YourGitHubUsername](https://github.com/AnkushGitRepo)

---

Thank you for using the Encryption & Decryption System!
