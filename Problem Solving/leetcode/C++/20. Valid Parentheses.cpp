#include <iostream>
#include <string>
#include <stack>
using namespace std;
class Solution {
public:
    bool isValid(string s) {
        stack<char> st;

        for (int i = 0; i < s.length(); i++) {
            if (s[i] == '(' || s[i] == '[' || s[i] =='{')
                st.push(s[i]);
            else if ((!st.empty()) && (st.top() == s[i] - 1 || st.top() == s[i] - 2))
                st.pop();
            else
                return false;
        }

        if (st.empty())
            return true;
        else
            return false;
    }
};

int main() {
    Solution solution;
    string input;

    cout << "Enter a string of parentheses: ";
    cin >> input;

    bool result = solution.isValid(input);
    cout << "Is valid: " << (result ? "true" : "false") << endl;

    return 0;
}