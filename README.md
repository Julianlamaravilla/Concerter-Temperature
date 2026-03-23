# Temperature Converter - Java (Swing)

## Description

This project is a **Temperature Converter** developed in **Java** using **JOptionPane (Swing)** for graphical input and output dialogs. The program allows the user to convert temperature values between **Celsius**, **Fahrenheit**, and **Kelvin**.

The application also includes basic error handling to prevent invalid inputs and incorrect option selections.

---

## Features

* Convert temperatures between:

  * Celsius → Fahrenheit
  * Celsius → Kelvin
  * Fahrenheit → Celsius
  * Fahrenheit → Kelvin
  * Kelvin → Celsius
  * Kelvin → Fahrenheit
* Graphical user interface using dialog boxes
* Input validation and error handling
* Prevents invalid option selection
* Handles non-numeric input errors

---

## Technologies Used

* Java
* Java Swing (JOptionPane)

---

## How It Works

1. The program asks the user to select the **input temperature unit**:

   * 1 → Celsius
   * 2 → Fahrenheit
   * 3 → Kelvin

2. The user enters the **temperature value**.

3. The program asks the user to select the **unit to convert to**.

4. The program performs the conversion and displays the result in a dialog box.

5. If the user enters invalid data or selects an invalid option, the program shows an error message and restarts.

---

## Conversion Formulas Used

| From       | To         | Formula                   |
| ---------- | ---------- | ------------------------- |
| Celsius    | Fahrenheit | (C × 1.8) + 32            |
| Celsius    | Kelvin     | C + 273.15                |
| Fahrenheit | Celsius    | (F − 32) / 1.8            |
| Fahrenheit | Kelvin     | ((F − 32) / 1.8) + 273.15 |
| Kelvin     | Celsius    | K − 273.15                |
| Kelvin     | Fahrenheit | 1.8 × (K − 273.15) + 32   |

---

## How to Run the Program

1. Make sure you have **Java JDK** installed.
2. Compile the program:

   ```
   javac Main.java
   ```
3. Run the program:

   ```
   java Main
   ```

---

## Error Handling

The program handles the following errors:

* Non-numeric input (NumberFormatException)
* Options outside the valid range (1–3)
* Same conversion unit selected (returns the same value)

If an error occurs, the program will display an error message and restart automatically.

---

## Author

Developed as a basic Java practice project to understand:

* Conditional structures
* Exception handling
* User input with Swing
* Unit conversion logic

---
