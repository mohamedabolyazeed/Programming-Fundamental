#include <iostream>
#include <string>
using namespace std;
class Solution {
public:
    int lengthOfLastWord(string s) {
        int n = s.length();
        int index = n - 1;

        while (index >= 0 && s[index] == ' ') {
            index--;
        }

        int temp = index;

        while (index >= 0 && s[index] != ' ') {
            index--;
        }

        return temp - index;
    }
};

int main() {
    Solution solution;
    string input;

    cout << "Enter a string: ";
    getline(cin, input);

    int result = solution.lengthOfLastWord(input);
    cout << "Length of the last word: " << result << endl;

    return 0;
}