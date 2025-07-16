// Initialize an array with names
let names = ["Mohamed", "Ahmed", "Ali"];

// Add a name to the end of the array
names.push("Abdo"); // ["Mohamed", "Ahmed", "Ali", "Abdo"]

// Add a name to the beginning of the array
names.unshift("Mohsen"); // ["Mohsen", "Mohamed", "Ahmed", "Ali", "Abdo"]

// Remove the first name from the array
names.shift(); // ["Mohamed", "Ahmed", "Ali", "Abdo"]

// Remove the last name from the array
names.pop(); // ["Mohamed", "Ahmed", "Ali"]

// Remove one element from index 1 ("Ahmed")
names.splice(1, 1); // ["Mohamed", "Ali"]

// Insert "Khaled" at index 0
names.splice(0, 0, "Khaled"); // ["Khaled", "Mohamed", "Ali"]

// Display the final array
console.log("Updated names list:", names); // ["Khaled", "Mohamed", "Ali"]

// Extract and display the first two names
console.log("First two names:", names.splice(0, 2)); // ["Khaled", "Mohamed"]
