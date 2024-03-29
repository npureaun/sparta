#include <string>
#include <iostream>
using namespace std;


int solution(string s) {
    string arr[10] = { "zero", "one","two","three","four","five","six","seven",
                "eight","nine" };
    string q="";
    int answer = 0;
    string p = "";
    for (int i = 0; i < s.length(); i++) {
        if (isalpha(s.at(i))) {
            q += s.at(i);
        }
        else {
            p += s.at(i);
        }
         if (q.length() >= 3){
           for (int j = 0; j < 10; j++) {
               if (q == arr[j]) {
                   p += to_string(j);
                   q = "";
               }
        }
        }
    }
    answer = stoi(p);
    return answer;
}