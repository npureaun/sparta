class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()
        for(i in m-1 until score.size step m)
        {
            answer+=score.slice((i-m)+1..i).minOf { it }*m
        }
        return answer
    }
}