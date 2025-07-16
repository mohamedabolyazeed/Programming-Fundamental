let name = `Mohamed is hacker `; // Defining a string

console.log(typeof 10, typeof `Mohamed`); // Output: "number" and "string"
// `typeof` returns the data type of the variable or expression.

console.log(typeof name); // Output: "string"

console.log(typeof name.toString); // Output: "function"
// `toString` is a method, so typeof returns "function".

console.log(name.repeat(4));
// Output: "Mohamed is hackerMohamed is hackerMohamed is hackerMohamed is hacker"
// Repeats the string 4 times.

console.log(name.length);
// Output: 17 → Counts the total number of characters including spaces.

console.log(name.charAt(0));
// Output: "M" → Returns the character at index 0.

console.log(name[1]);
// Output: "o" → Accessing character at index 1 using bracket notation.

console.log(name.indexOf("h"));
// Output: 7 → Finds the first occurrence of 'h' in the string.

console.log(name.split(" "));
// Output: ["Mohamed", "is", "hacker"] → Splits the string into an array using space as a separator.

console.log(name.split(" ")[2]);
// Output: "hacker" → Accesses the third element from the split array.

console.log(name.substr(0, 8)); // Output: "Mohamed"
// substr(start, length): Extracts 8 characters starting from index 0.
// So, it takes characters from index 0 to 7: "Creative".

console.log(name.substring(8, 11)); // Output: "is"
// substring(start, end): Extracts characters from index 8 to 10 .
// So, it takes characters from index 8 to 10: "is".

console.log(name.slice(-7)); // Output: "hacker"
// slice(start): When a negative index is used, it counts from the end of the string.
// slice(-7) starts from the 7th character from the end and goes to the end of the string.
// So, it extracts the last 7 characters: "hacker".
