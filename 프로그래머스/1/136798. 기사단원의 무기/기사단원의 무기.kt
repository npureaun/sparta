import java.lang.Math.sqrt

class Solution {
    private fun getCount(n: Int): Int {
        var cnt=0
        for(i in 1..sqrt(n.toDouble()).toInt())
            if(n%i==0) cnt+=if(i==n/i) 1 else 2
        return cnt
    }

    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0
        for (i in 1..number) {
            answer += if (getCount(i) > limit) power else getCount(i)
        }
        return answer
    }
}