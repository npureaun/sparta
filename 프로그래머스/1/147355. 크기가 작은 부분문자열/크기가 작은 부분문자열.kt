class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        t.forEachIndexed { index, c ->
            if(index+p.length<=t.length) {
                val substr = t.substring(index, index + p.length)
                if (p >= substr) answer++
            }
        }
        return answer
    }
}