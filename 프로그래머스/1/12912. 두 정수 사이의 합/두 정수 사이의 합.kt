import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long=0
        (min(a,b)..max(a,b)).forEach { answer+= it;}
        return answer
    }
}