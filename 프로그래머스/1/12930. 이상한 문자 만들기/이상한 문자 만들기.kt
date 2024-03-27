class Solution {
    fun solution(s: String): String {
        var answer = ""
        var i:Int=0
        s.forEach {
            if(it!=' ') {
                answer+=if (i % 2 == 0) it.uppercase() else it.lowercase()
                i++
            }
            else {answer+=it; i=0}
        }
        return answer
    }
}