let student = [
  { firstname: "Mohamed", lastname: "Abolyazeed", gender: "Male", grade: 30 },
  { firstname: "Ahmed", lastname: "Hasan", gender: "Male", grade: 19 },
  { firstname: "Donia", lastname: "Ahmed", gender: "Female", grade: 28 },
];

console.log("Student First Names:");
student.forEach((student) => {
  console.log(student.firstname);
});

console.log("");

const maleOnly = student.filter((student) => {
  return student.gender === "Male";
});

console.log("Male Students:");
console.log(maleOnly);

const personToFind = student.find((student) => {
  return student.firstname === "Donia";
});

console.log("Found Student:");
console.log(personToFind);

let studentCopy = [
  ...student,
  { firstname: "Samaa", lastname: "Mahmoued", gender: "Female", grade: 30 },
];

console.log("Updated Student List:");
console.log(studentCopy);
