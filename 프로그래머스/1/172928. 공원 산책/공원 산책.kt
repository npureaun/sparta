class Solution {
    private fun findStartPoint(park: Array<String>):IntArray
    {
        val findIndex=park.joinToString("").indexOf("S")
        return intArrayOf(findIndex/park.size, findIndex%park.size)
    }
    
     fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer = findStartPoint(park)
        val m = mapOf<Char, Pair<Int, Int>>(
            'N' to Pair(-1, 0),
            'S' to Pair(1, 0),
            'W' to Pair(0, -1),
            'E' to Pair(0, 1),
        )

        var backUp = answer.copyOf()
        for (i in routes.indices) {
            var isFail = false
            for (j in 0 until routes[i].last().digitToInt()) {
                answer[0] += m[routes[i].first()]!!.first
                answer[1] += m[routes[i].first()]!!.second
                if (!(answer[0] in park.indices && answer[1] in park[answer[0]].indices
                            && park[answer[0]][answer[1]] != 'X')
                ) {
                    isFail = true
                    break
                }
            }
            if (isFail) answer = backUp.copyOf()
            else backUp=answer.copyOf()
        }
        return answer
    }
}