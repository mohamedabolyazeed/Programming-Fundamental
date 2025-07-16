function showName() {
  var nameArray = [];
  var indexordered = [
    'first',
    'second',
    'third',
    'fourth',
    'fifth',
    'sixth',
    'seventh',
    'eighth',
    'ninth',
    'tenth'
  ];
  var i = 0;

  while (i < 5) {
    var enteredName = prompt('Enter name:').trim();
    
    if (enteredName) {
      nameArray[i] = enteredName;
      i++;
    } else {
      alert("Please enter a valid name!");
    }
  }

  var searchName = prompt('Enter name to search:').trim();
  
  if (searchName) {
    var index = nameArray.indexOf(searchName);
    if (index >= 0) {
      alert('Name found: ' + indexordered[index]);
    } else {
      alert('Name not found.');
    }
  }
}

showName();
