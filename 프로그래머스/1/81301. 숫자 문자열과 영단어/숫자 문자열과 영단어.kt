class Solution {
    fun solution(s: String): Int {
        var answer: String = ""
        val strArr=arrayOf("zero", "one","two","three","four","five","six","seven",
            "eight","nine")
        var Stoken=""
        s.forEach {
            if(it.isLetter()) Stoken+=it
            else answer+=it.digitToInt()
            if(Stoken.length>=3&&Stoken in strArr) {
                answer += strArr.indexOf(Stoken)
                Stoken=""
            }
        }
        return answer.toInt()
    }
}