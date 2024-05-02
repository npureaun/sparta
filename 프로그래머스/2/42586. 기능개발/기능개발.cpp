#include <string>
#include <vector>
#include <iostream>
using namespace std;

void summit(vector<int>& progresses, vector<int>& speeds)
{
    for (int i = 0; i < progresses.size(); i++)
    {
        progresses[i] += speeds[i];
    }
}

int release_Count(int start_index, vector<int> progresses, vector<int> speeds)
{
    int release = 1;
    for (int j = start_index + 1; j < progresses.size(); j++)
    {
        if (progresses[j] >= 100)
            release++;
        else
            break;
    }
    return release;
}

vector<int> solution(vector<int> progresses, vector<int> speeds)
{
    vector<int> answer;

    for (int i = 0; i < progresses.size(); i++)
    {
        summit(progresses, speeds);
        if (progresses[i] >= 100)
        {
            int release=release_Count(i, progresses, speeds);
            answer.push_back(release);
            i+=release-1;
        }
        else
        {
            i--;
        }
    }
   
    return answer;
}