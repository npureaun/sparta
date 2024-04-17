class Solution {
    private fun getDivisorCount(n: Int): Int {
        if(n==1)return 1
        else if(n==2||n==3)return 2
        var cnt=0
        for(i in 1..Math.sqrt(n.toDouble()).toInt())
        {
            if(i*i==n) cnt++
            else if(n%i==0) cnt+=2
        }
        return cnt
    }

    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0
        for (i in 1..number) {
            val count = getDivisorCount(i)
            answer += if (count > limit) power else count
        }
        return answer
    }
}