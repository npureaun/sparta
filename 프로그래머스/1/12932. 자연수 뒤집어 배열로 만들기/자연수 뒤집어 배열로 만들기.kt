class Solution {
    fun solution(n: Long)= IntArray(n.toString().length){(n.toString().reversed())[it].digitToInt()}
}