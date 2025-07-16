# include <iostream>
using namespace std;

int main() {
  int lines;
  cin >> lines;
  int counter = 1;
  for (int i = 1; i <= lines; i++) {
    cout << counter++ << " " << counter++ << " " << counter++ << " PUM" << endl;
    counter++; 
  }
}