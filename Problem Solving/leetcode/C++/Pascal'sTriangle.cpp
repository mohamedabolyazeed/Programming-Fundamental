#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> triangle;

        for (int i = 0; i < numRows; i++) {
            vector<int> row;
            long long z = 1;

            for (int j = 0; j <= i; j++) {
                row.push_back(z);
                z = z * (i - j) / (j + 1);
            }

            triangle.push_back(row);
        }

        return triangle;
    }
};

int main() {
    Solution sol;

    int numRows;
    cin >> numRows;

    vector<vector<int>> result = sol.generate(numRows);

    for (int i = 0; i < result.size(); i++) {
        for (int j = 0; j < result[i].size(); j++) {
            cout << result[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}