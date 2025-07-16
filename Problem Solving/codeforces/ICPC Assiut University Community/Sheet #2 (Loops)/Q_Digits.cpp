#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {
    int T;
    cin >> T;
    vector<string> results;
    while (T--) {
        string N;
        cin >> N;
        string result;
        for (int i = N.length() - 1; i >= 0; --i) {
            result += N[i];
            if (i > 0) {
                result += " ";
            }
        }
        results.push_back(result); }

    for (const string& res : results) {
        cout << res << endl;
    }

    return 0;
}