class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        absolutes.forEachIndexed { i, it ->
            if(signs[i]==true) answer+=it
            else answer-=it
        }
        return answer
    }
}