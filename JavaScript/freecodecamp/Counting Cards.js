let count = 0;

function cc(card) {
  switch (card) {
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      count++;
      break;
    case 7:
    case 8:
    case 9:
      break;
    case 10:
    case 'J':
    case 'Q':
    case 'K':
    case 'A':
      count--;
      break;
  }
  return count > 0 ? count + " Bet" : count + " Hold";
}
console.log(cc(2));
console.log(cc(3)); 
console.log(cc(7)); 
console.log(cc('K'));
console.log(cc('A')); 
console.log(cc(10)); 
console.log(cc('J')); 
console.log(cc(5));
console.log(cc(2)); 
console.log(cc('A')); 
console.log(cc(10)); 
console.log(cc(3)); 
