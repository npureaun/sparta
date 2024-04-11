class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()
        for(i in score.indices)
        {
            if((i+1)%m==0) answer+=score[i]*m
        }
        return answer
    }
}