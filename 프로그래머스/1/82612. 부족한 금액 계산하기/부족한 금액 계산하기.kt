class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        var arr=Array<Int>(count){i-> price*(i+1)}
        arr.forEach { answer+=it.toLong() }
        return if(money-answer>0L) 0L else answer-money
    }
}