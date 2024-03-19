class Solution {
    fun solution(phone_number: String): String {
        var answer = StringBuilder(phone_number)
        for(i in 0 until answer.length-4)
            answer[i]='*'
        return answer.toString()
    }
}