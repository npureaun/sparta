class Solution {
    fun sum(progresses: IntArray, speeds:IntArray)
    {
        repeat(progresses.size) {progresses[it] += speeds[it]}
    }

    fun releaseCount(startIndex: Int, progresses: IntArray): Int {
        var release = 1
        for (j in (startIndex + 1).until(progresses.size)) {
            if (progresses.get(j) >= 100) release++
            else break
        }
        return release
    }

    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()

        var i = 0
        while (i < progresses.size) {
            sum(progresses, speeds)
            if (progresses[i] >= 100) {
                val release: Int = releaseCount(i, progresses)
                answer+=release
                i += release - 1
            } else {
                i--
            }
            i++
        }

        return answer
    }
}
