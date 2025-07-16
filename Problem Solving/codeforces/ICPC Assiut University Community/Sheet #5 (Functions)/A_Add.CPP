# include <iostream>
using namespace std;

void addAndPrint(int x, int y) {
  cout << x + y << endl;
}

int main() {
  int x, y;
  cin >> x >> y;
  addAndPrint(x, y);
  return 0;
}