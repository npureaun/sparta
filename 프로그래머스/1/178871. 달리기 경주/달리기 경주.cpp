#include <string>
#include <vector>
#include <iostream>
#include <unordered_map>
#include <algorithm>
using namespace std;

vector<string> solution(vector<string> players, vector<string> callings) {
    unordered_map<string,int>map;
    for (int i = 0; i < players.size(); i++)
    {
        map.insert(make_pair(players[i], i));
    }
    for (string str : callings)
    {
        string sub_str = players[map[str] - 1];
        swap(players[map[str]], players[map[sub_str]]);
        swap(map[str], map[sub_str]);
    }
    return players;
}
