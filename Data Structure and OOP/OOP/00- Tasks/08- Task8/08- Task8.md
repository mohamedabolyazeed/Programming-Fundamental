# Fraction Calculator Program in C++

This project involves developing a simple fraction calculator program in C++ using object-oriented principles. The program allows users to perform basic arithmetic operations on fractions, including addition, subtraction, multiplication, and division.

## Requirements

### Fraction Class

1. **Class Definition**:
    - Create a C++ class named `Fraction` with private data members `numerator` and `denominator`.
    - Include a default constructor that initializes the denominator to 1.
    - Implement a method `checkDenominator` to check if the denominator is not zero.
    - Include setter and getter methods for the numerator and denominator.
    - Implement a `print` method to display the fraction.

2. **Arithmetic Operations**:
    - Overload the following arithmetic operators in the `Fraction` class:
        - `+` (addition)
        - `-` (subtraction)
        - `*` (multiplication)
        - `/` (division)

3. **Comparison Operators**:
    - Overload the following comparison operators in the `Fraction` class:
        - `==` (equality)
        - `!=` (inequality)

### Main Function

1. **Fraction Instances**:
    - In the main function, create two instances of the `Fraction` class (`n1` and `n2`).
    - Prompt the user to enter the numerator and denominator for each fraction.
    - Display the entered fractions using the `print` method.

2. **Perform Arithmetic Operations**:
    - Perform the following arithmetic operations on the fractions:
        - Addition (`+`)
        - Subtraction (`-`)
        - Multiplication (`*`)
        - Division (`/`)
    - Display the results using the `print` method.

3. **Equality Check**:
    - Check if the two fractions are equal using the `==` operator.
    - Check if the two fractions are not equal using the `!=` operator.
    - Display the results of the equality checks.

4. **Input Validation**:
    - Implement basic input validation to ensure that denominators are not zero.
    - Display an error message if the user attempts to set a denominator to zero.

### Documentation

- Include comments in your code to explain the purpose and functionality of each section.
- Provide a brief description of the program and how to use it.

### Knowledge requirements
- (Language-specific, e.g., C++) 
- overloading 
- operator overloading 
