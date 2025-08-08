#include <iostream>
using namespace std;

class Solution {
public:
    bool isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int revHalf = 0;
        while (x > revHalf) {
            int digit = x % 10;
            revHalf = revHalf * 10 + digit;
            x /= 10;
        }

        
        return (x == revHalf || x == revHalf / 10);
    }
};

int main() {
    Solution solution;
    int input;

    cout << "Enter a number: ";
    cin >> input;

    bool result = solution.isPalindrome(input);
    cout << "Is palindrome: " << (result ? "true" : "false") << endl;

    return 0;
}