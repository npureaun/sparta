class Solution {
    private fun getCheck(n: Int):Int=if(n<2)6 else 7-n

    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val equals= mutableListOf(0,0)
        lottos.forEach { i->
            if(i==0)equals[0]++
            win_nums.forEach { j->
                if(i==j)equals[1]++
            }
        }
        return intArrayOf(getCheck(equals[1]+equals[0]), getCheck(equals[1]))
    }
}