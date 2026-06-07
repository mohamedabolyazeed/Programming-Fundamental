#include <vector>
#include <iostream>
using namespace std;

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int x = 0;

        for (int j = 0; j < nums.size(); j++) {
            if (nums[j] != val) {
                nums[x] = nums[j];
                x++;
            }
        }

        return x;
    }
};

int main() {
    Solution sol;
    vector<int> nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    int k = sol.removeElement(nums, val);
    cout << "k = " << k << endl;
    for (int i = 0; i < k; i++) {
        cout << nums[i] << " ";
    }
    cout << endl;
    return 0;
}