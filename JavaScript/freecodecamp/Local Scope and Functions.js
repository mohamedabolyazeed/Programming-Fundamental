let myVar; 
function myLocalScope() {
  myVar = 5; 
  console.log('inside myLocalScope', myVar);
}
myLocalScope();
console.log('outside myLocalScope', myVar);
