class Solution {
    fun solution(n: Long): Long {
        var s: String=n.toString()
        val arr= Array<Int>(s.length) { i -> s[i].digitToInt() }
        s=""
        arr.sortDescending()
        arr.forEach{s+=it.digitToChar()}
        return s.toLong()
    }
}