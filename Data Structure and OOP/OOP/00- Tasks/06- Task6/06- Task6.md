# Task : Implement a Composition Relationship

## Objective

Create three classes, `Country`, `State`, and `City`, to establish a composition relationship where a country contains multiple states, and each state contains multiple cities.

## Requirements

### Country Class

1. **Attributes**:
    - `countryName` (string): The name of the country.
    - `states` (list of `State` objects): A list containing the states within the country.

2. **Methods**:
    - Constructor to initialize the country name.
    - Method to add a state to the country.
    - Method to display the list of states along with their details.

### State Class

1. **Attributes**:
    - `stateName` (string): The name of the state.
    - `cities` (list of `City` objects): A list containing the cities within the state.

2. **Methods**:
    - Constructor to initialize the state name.
    - Method to add a city to the state.
    - Method to display the list of cities along with their details.

### City Class

1. **Attributes**:
    - `cityName` (string): The name of the city.

2. **Methods**:
    - Constructor to initialize the city name.
    - Getter and setter methods for the city name.

### Composition

1. **Containment**:
    - The `Country` class contains a list of `State` objects.
    - The `State` class contains a list of `City` objects.
    - Implement methods in the `Country` class to add a `State` and in the `State` class to add a `City`.
    - Implement methods in the `Country` class to display the list of states with their details and in the `State` class to display the list of cities with their details.

### Implementation Details

- Use a collection (e.g., vector or list) in the `Country` class to store the list of states and in the `State` class to store the list of cities.
- Ensure proper encapsulation and data validation.
- Include comments to explain the purpose and functionality of each section.


### Knowledge requirements
- Composition Relationship