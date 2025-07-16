# include <iostream>
using namespace std;

int main() {
  int num, range1, range2;
  long long sum = 0;
  cin >> num >> range1 >> range2;

  for (int i = 1; i <= num; i++) {
    int myNum = i;
    int mySum = 0;
    while (myNum) {
      int digit = myNum % 10;
      mySum += digit;
      myNum /= 10;
    }
    if (mySum >= range1 && mySum <= range2) {
      sum += i;
    }
  }

  cout << sum << endl;
}