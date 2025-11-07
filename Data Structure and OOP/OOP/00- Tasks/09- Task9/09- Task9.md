#  Program: single inhertance

## Objective

Create a simple  program with two classes, `Shape` and `Circle`. The `Shape` class will have data members for width and height, and a function to calculate the area. The `Circle` class will inherit from `Shape` and include an additional data member for the radius. Implement the necessary functions to calculate the area of a circle and display the results, ensuring the radius cannot be changed once set.

## Requirements

### Shape Class

1. **Attributes**:
    - `width` (double): The width of the shape.
    - `height` (double): The height of the shape.

2. **Methods**:
    - Constructor to initialize the width and height.
    - Method to calculate the area of the shape.
    - Getter and setter methods for width and height.

### Circle Class

1. **Attributes**:
    - `radius` (double): The radius of the circle (private and constant to prevent changes).

2. **Methods**:
    - Constructor to initialize the radius (calls the `Shape` constructor with appropriate values).
    - Method to calculate the area of the circle.
    - Getter method for the radius (no setter to prevent changes).

### Implementation Details

- Inherit the `Circle` class from the `Shape` class.
- Override the area calculation method in the `Circle` class to compute the area of a circle.
- Ensure that the radius cannot be modified once it is set.

### Knowledge requirements
- single inhertance 
- overriding Method


