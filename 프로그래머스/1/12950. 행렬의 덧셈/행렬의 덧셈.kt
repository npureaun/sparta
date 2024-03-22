class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        arr1.forEachIndexed { index, i ->
            var arr = arrayOf<Int>()
            i.forEachIndexed { ind, j ->
                arr+=(j+arr2[index][ind])
            }
            answer+=(arr.toIntArray())
        }
        return answer
    }
}