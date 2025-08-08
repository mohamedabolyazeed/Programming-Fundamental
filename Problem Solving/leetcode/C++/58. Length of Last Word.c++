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