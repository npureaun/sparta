class Solution {
    fun solution(s: String): Int {
        var answer: String = s
        val strArr=arrayOf("zero", "one","two","three","four","five","six","seven",
            "eight","nine")
        strArr.forEachIndexed { index, it ->
            answer=answer.replace(it, index.toString())
        }
        return answer.toInt()
    }
}