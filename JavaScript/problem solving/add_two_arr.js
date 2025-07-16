//method 1
var arr1 = [1, 0, 2, 3, 4];
var arr2 = [3, 5, 6, 7, 8, 13];

var bigarr, smallarr;

if (arr1.length > arr2.length) {
  bigarr = arr1;
  smallarr = arr2;
} else {
  bigarr = arr2;
  smallarr = arr1;
}

var resarray = bigarr.map((e, i) => {
  return e + (smallarr[i] || 0);
});

console.log(resarray);




//method 2
/* var arr1 = [1, 0, 2, 3, 4];
var arr2 = [3, 5, 6, 7, 8, 13];
var resarray = [];
var len = Math.max(arr1.length, arr2.length);
for (var i = 0; i < len; i++) {
  resarray.push((arr1[i] || 0) + (arr2[i] || 0));
}
console.log(resarray);
*/