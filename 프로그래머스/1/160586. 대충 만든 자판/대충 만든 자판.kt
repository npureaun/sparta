class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        targets.forEach { text ->
            var cnt = 0
            for (i in text.indices) {
                var minimum = 1000
                keymap.forEach { bord ->
                    if(text[i] in bord)
                        minimum = minOf(bord.indexOf(text[i])+1, minimum)
                }
                cnt += minimum
            }
            answer += if(cnt>=1000)-1 else cnt
        }

        return answer
    }
}
