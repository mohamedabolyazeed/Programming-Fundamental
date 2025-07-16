// Demonstrating Unary Plus (+) and Minus (-) Operators
console.log(+"5"); // Output: 5 → Converts "5" to a number
console.log(-"6"); // Output: -6 → Converts "6" to -6
console.log(-"-6"); // Output: 6 → Double negative, converts "-6" to 6

// Handling invalid conversions
console.log(+"mohamed"); // Output: NaN → "mohamed" cannot be converted to a number
console.log(+"undefined"); // Output: NaN → "undefined" is not a valid number
console.log(+"null"); // Output: NaN → "null" is treated as an invalid number

// Using Number() function
console.log(Number("6")); // Output: 6 → Converts "6" to a number

var num1 = "10"; // String
var num2 = "20"; // Number
console.log(num1 + num2); // Output: 1020 → Concatenation of strings
console.log(Number(num1) + Number(num2)); // Output: 30 → Addition of numbers

// Checking JavaScript's Safe Integer Limits
console.log(Number.MIN_SAFE_INTEGER); // Output: -9007199254740991 → Smallest safe integer
console.log(Number.MAX_SAFE_INTEGER); // Output: 9007199254740991 → Largest safe integer

// Validating Safe Integers
console.log(Number.isSafeInteger(9007199254740991)); // Output: true → Within the safe integer range
console.log(Number.isSafeInteger(90071992547409911)); // Output: false → Exceeds safe integer limit

// Checking if a Value is an Integer
console.log(Number.isInteger(900)); // Output: true → 900 is an integer
console.log(Number.isInteger("900")); // Output: false → "900" is a string, not a number

// Checking for NaN (Not a Number)
console.log(Number.isNaN("70")); // Output: false → "70" is a string, not NaN
console.log(Number.isNaN("mohamed" + 10)); // Output: false → "mohamed10" is a string, not NaN
console.log(Number.isNaN("mohamed" - 10)); // Output: true → "mohamed" - 10 results in NaN
