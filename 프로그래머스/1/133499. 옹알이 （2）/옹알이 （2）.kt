class Solution {
    fun solution(병신소리: Array<String>) = 병신소리.count { it.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$".toRegex()) }
}
