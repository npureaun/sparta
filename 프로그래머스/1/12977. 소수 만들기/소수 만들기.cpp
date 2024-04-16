#include <vector>
#include <iostream>
using namespace std;

bool check(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int solution(vector<int> nums) {
    int answer = 0;
    for (int i = 0; i < nums.size(); i++) {
        for (int j = i + 1; j < nums.size(); j++) {
            for (int n = j + 1; n < nums.size(); n++) {
                if (check(nums[i] + nums[j] + nums[n]))answer++;
            }
        }
    }
    return answer;
}