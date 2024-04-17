import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        val q: Queue<Int> = LinkedList(section.toList())
        while (q.isNotEmpty())
        {
            val first=q.peek()+m
            q.poll()
            while (q.isNotEmpty()&&q.peek()<first) q.poll()
            answer++
        }
        return answer
    }
}