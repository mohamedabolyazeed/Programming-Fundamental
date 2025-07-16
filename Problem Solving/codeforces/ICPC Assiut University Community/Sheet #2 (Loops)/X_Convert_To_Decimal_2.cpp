# include <iostream>
using namespace std;

int countOnes(int n) {
  int count = 0;
  while (n) {
    count += n & 1;
    n >>= 1;
  }
  return count;
}

int main() {
  int T;
  cin >> T;
  while (T--) {
    int N;
    cin >> N;
    int onesCount = countOnes(N);
    int result = (1 << onesCount) - 1;
    cout << result << endl;
    cout << "-------------" << endl;
  }
  return 0;
}