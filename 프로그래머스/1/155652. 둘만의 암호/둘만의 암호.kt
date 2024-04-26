class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val alpha = ('a'..'z').map { it }.toTypedArray()
        var answer: String = ""
        s.forEach{
            var loop=1
            var cnt=0
            while (cnt!=index)
            {
                val tk=alpha[(alpha.indexOf(it)+loop++)%(alpha.size)]
                if(tk !in skip) { cnt++ }
            }
            answer+=alpha[(alpha.indexOf(it)+loop-1)%alpha.size]
        }
        return answer
    }
}