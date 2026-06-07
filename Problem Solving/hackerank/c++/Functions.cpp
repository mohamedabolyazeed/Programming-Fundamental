#include <iostream>
using namespace std;

int main() {
    int a, b, c, d;
    cin >> a >> b >> c >> d;

    int maxNum = a;

    if (b > maxNum)
        maxNum = b;

    if (c > maxNum)
        maxNum = c;

    if (d > maxNum)
        maxNum = d;

    cout << maxNum;

    return 0;
}