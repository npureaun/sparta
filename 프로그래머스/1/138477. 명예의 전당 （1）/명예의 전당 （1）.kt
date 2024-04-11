import java.util.PriorityQueue

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var q = PriorityQueue<Int>()

        score.forEach {
            q.add(it)
            if (q.size > k) q.poll()
            answer += q.peek()
        }
        return answer
    }
}