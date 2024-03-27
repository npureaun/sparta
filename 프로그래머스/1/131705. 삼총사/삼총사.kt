class Solution {
    fun solution(number: IntArray): Int {
        var answer = 0
        val size: Int = number.size
        for (i in 0.until(size)) {
            for (j in (i + 1).until(size)) {
                for (n in (j + 1).until(size)) {
                    if ((number[i] + number[j] + number[n]) == 0) {
                        answer++
                    }
                }
            }
        }
        return answer
    }
}