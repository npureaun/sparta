import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val q1: Queue<String> = LinkedList(cards1.toList())
        val q2: Queue<String> = LinkedList(cards2.toList())

        goal.forEach {
            when (it) {
                q1.peek() -> q1.poll()
                q2.peek() -> q2.poll()
                else -> return "No"
            }
        }
        return "Yes"
    }
}