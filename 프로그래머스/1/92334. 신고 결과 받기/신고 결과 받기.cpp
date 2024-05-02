#include <string>
#include <vector>
#include <iostream>
#include <unordered_map>
#include <unordered_set>
using namespace std;


vector<int> solution(vector<string> id_list, vector<string> report, int k) {
    vector<int> answer(id_list.size());
    unordered_map <string, unordered_set<string>> reportmap;
    unordered_map <string, unordered_set<string>> resultmap;
    for (string r : report) {
        size_t pos = r.find(' ');
        string front = r.substr(0, pos);
        string back = r.substr(pos + 1);
        reportmap[front].insert(back);
        resultmap[back].insert(front);
    }
    for (int i = 0; i < id_list.size(); i++) {
        string user = id_list.at(i);
        auto it = reportmap.find(user);
        if (it == reportmap.end()) {
            continue;
        }
        else {
            for (string bad : it->second) {
                if (resultmap[bad].size() >= k) {
                    answer[i]++;
                }
            }
        }
    }
    return answer;
}