#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;
  for (int i = 1; i <= n; i++) { // lines
    for (int j = 0; j < n - i; j++) { // spaces 
      cout << " ";
    }
    for (int k = 0; k < 2 * i - 1; k++) { // stars
      cout << "*";
    }
    cout << endl;
  }
  return 0;
}


/*
 int main() {
  int lines;
  cin >> lines;
  int spaces = lines - 1;
  for (int z = 1; z <= lines; z++) {
    for (int y = 1; y <= spaces; y++) {
      cout << " ";
    }
    for (int g = 1; g < z * 2; g++) {
      cout << "*";
    }
    spaces--;
    cout << endl;
  }
  return 0;
} 

*/