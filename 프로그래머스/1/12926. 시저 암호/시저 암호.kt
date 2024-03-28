class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        s.forEach {
            answer+=if(it in ('a'..'z')|| it in ('A'..'Z'))
                    if(it.isLowerCase()&&it+n in ('a'..'z')||
                        it.isUpperCase()&&it+n in ('A'..'Z'))
                        it+n
                    else (((it+n-if(it.isLowerCase())122 else 90))+if(it.isLowerCase())96 else 64)
            else it
        }
        return answer
    }
}