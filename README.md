# ASCII Encryption & Decryption Program

This Java program allows you to **encrypt** text into ASCII codes and **decrypt** ASCII codes back into text. It uses `StringBuilder` for efficient string manipulation and provides a simple user interface through the console.

---

## Features

- Encrypt a string into ASCII numbers separated by `%`.
- Decrypt a string of ASCII numbers back to the original text.
- Input validation to ensure the user provides correct operation choices and non-empty text.
- Console-based interaction for simplicity.

---

## How It Works

1. **Encryption**:  
   Each character in the input string is converted to its ASCII code and concatenated with `%` as a separator.  

   Example:
   Input: Hello
   Encrypted: 72%101%108%108%111

 
2. **Decryption**:  
The program splits the ASCII string by `%` and converts each number back to the corresponding character.

Example:  
Input: 72%101%108%108%111
Decrypted: Hello


---

## Usage

1. Run the program.
2. Choose the operation:
- `1` for Encryption
- `2` for Decryption
3. Enter the text or ASCII string depending on the operation.
4. The program outputs the result.

---

## Example Run


What operation do you need? (1 - encryption, 2 - decryption): 1
Enter text: Hello
Encrypted text: 72%101%108%108%111


---

## Requirements

- Java JDK 8 or higher
- Basic console to run Java programs

---

## Notes

- `%` is used as a separator for ASCII values; do not use `%` in the input for decryption.
- The program handles empty input and invalid operation selections with proper messages.
- Uses `StringBuilder` for efficient string concatenation.

---

## Author

- Aleksandrs Kuznecovs
