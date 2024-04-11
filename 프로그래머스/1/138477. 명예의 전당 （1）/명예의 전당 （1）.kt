class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var arr = IntArray(k){-1}

        for(i in score.indices)
        {
            if(arr.minOf { it } < score[i])
            {
                arr[arr.indexOf(arr.minOf { it })] = score[i]
            }

            answer+=arr.filter { it>-1 }.minOf { it }
        }
        return answer
    }
}