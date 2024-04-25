import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(s: String): Int {
        var answer = 0
        val score= mutableListOf(0,0)
        val q : Queue<Char> = LinkedList(s.toList())

        var c=q.peek()
        val str=StringBuilder()
        while (q.isNotEmpty())
        {
            if(q.peek()==c) score[0]++
            else score[1]++
            str.append(q.poll())

            if(score.first()==score.last()) {
                score[0]=0
                score[1]=0
                answer++
                str.clear()
                c=q.peek()
            }
        }

        return if(str.isNotBlank())++answer else answer
    }
}