#include <string>
#include <vector>
#include <iostream>
using namespace std;

int checker(int x) {
    if (x < 2) {
        return 6;
    }
    else
        return 7 - x;
}

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    int lapf = 0;
    int laps = 0;
    for (int i : lottos) {
        if (i == 0) {
            laps++;
        }
        for (int j : win_nums) {
            if (i == j) {
                lapf++;
            }
        }
    }
    answer.push_back(checker(lapf+laps));
    answer.push_back(checker(lapf));
    return answer;
}