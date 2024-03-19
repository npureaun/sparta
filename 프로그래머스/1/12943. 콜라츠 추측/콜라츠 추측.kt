class Solution {
    fun solution(num: Int): Int {
        var numL: Long=num.toLong()
        var loop: Int=0
        while (true)
        {
            if(loop>=500){loop=-1; break}
            else if(numL==1L){break}
            else numL= if(numL%2==0L) numL/2 else numL*3+1
            loop++
        }
        return loop
    }
}