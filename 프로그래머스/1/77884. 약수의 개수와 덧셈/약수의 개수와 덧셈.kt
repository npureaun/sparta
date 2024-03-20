class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer = 0
        for (i in left..right) {
            var lapf = 0
            for (j in 1..i){ if (i % j == 0) lapf++}
            answer+=if (lapf % 2 == 0)  i  else  -i
        }
        return answer
    }
}
