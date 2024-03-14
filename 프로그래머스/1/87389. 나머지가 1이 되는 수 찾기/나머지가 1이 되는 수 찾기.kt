class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        while (true){ if(n%++answer==1)break}
        return answer
    }
}