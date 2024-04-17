class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var i=0
        section.forEach { if(it>=i) {answer++; i=it+m} }
        return answer
    }
}