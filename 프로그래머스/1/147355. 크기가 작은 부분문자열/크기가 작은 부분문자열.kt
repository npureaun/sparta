class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        t.forEachIndexed { index, c ->
            if(index+p.length<=t.length&& p >= t.substring(index, index + p.length)) answer++
        }
        return answer
    }
}