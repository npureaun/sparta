class Solution {
    fun solution(X: String, Y: String): String {
        var answer = StringBuilder()
        val checkX=Array<Int>(10){0}
        val checkY=Array<Int>(10){0}

        X.forEach { checkX[it.digitToInt()]++}
        Y.forEach { checkY[it.digitToInt()]++}
        for(i in 0..9)
        {
            if(checkX[i]>0&&checkY[i]>0)
            {
                for(j in 0 until minOf(checkX[i],checkY[i]))
                    answer.append(i.digitToChar())
            }
        }

        if(answer.isEmpty())return "-1"
        if(answer.all { it=='0' }) return "0"
        return answer.toList().sortedDescending().joinToString("")
    }
}
