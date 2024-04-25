class Solution {
    fun solution(X: String, Y: String): String {
        val answer = StringBuilder()
        
        for(i in 0..9)
        {
            val xCount=X.count { it==i.digitToChar() }
            val yCount=Y.count { it==i.digitToChar() }
            if(xCount>0&&yCount>0)
            {
                for(j in 0 until minOf(xCount,yCount))
                    answer.append(i.digitToChar())
            }
        }

        if(answer.isEmpty())return "-1"
        if(answer.all { it=='0' }) return "0"
        return answer.toList().sortedDescending().joinToString("")
    }
}
