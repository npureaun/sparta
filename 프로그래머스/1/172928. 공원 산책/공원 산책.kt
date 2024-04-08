class Solution {
    private fun findStartPoint(park: Array<String>):IntArray
    {
        val now= IntArray(2){0}
        for(i in park.indices)
        {
            if(park[i].indexOf("S")!=-1) {
                now[1] = park[i].indexOf("S")
                break
            }
            else now[0]++
        }
        return now
    }
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer = findStartPoint(park)
        val m = mapOf<Char, Pair<Int, Int>>(
            'N' to Pair(-1, 0),
            'S' to Pair(1, 0),
            'W' to Pair(0, -1),
            'E' to Pair(0, 1),
        )

        val st = ArrayDeque<IntArray>().apply { add(answer.copyOf()) }
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
            if (isFail) answer = st.last().copyOf()
            else st.add(answer.copyOf())
        }
        return answer
    }
}