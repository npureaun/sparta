import java.lang.Math.sqrt

class Solution {
    private fun getCount(n: Int):Int=
        (1..sqrt(n.toDouble()).toInt()).filter { n%it==0 }
            .sumOf { +if(it==n/it) 1 else 2 }

    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0
        for (i in 1..number) {
            answer += if (getCount(i) > limit) power else getCount(i)
        }
        return answer
    }
}