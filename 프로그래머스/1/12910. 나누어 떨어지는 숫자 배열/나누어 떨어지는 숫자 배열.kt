class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer= arr.filter { it%divisor==0 }
        return if(answer.isEmpty()) intArrayOf(-1) else answer.sorted().toIntArray()
    }
}