class Solution {
    fun solution(x: Int)=x % x.toString().map { it.digitToInt() }.sum()==0
}