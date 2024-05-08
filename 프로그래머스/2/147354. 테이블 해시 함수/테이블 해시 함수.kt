class Solution {
    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        var answer: Int = 0
        data.sortWith(compareBy({it[col-1]},{-it[0]}))

        for(i in row_begin-1..row_end-1) {
            answer= answer xor  data[i].sumOf { it%(i+1) }
        }
        return answer
    }
}