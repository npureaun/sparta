
class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        val cnt= Array(n){1}
        reserve.sort()
        lost.sort()
        reserve.forEach { cnt[it-1]++ }
        lost.forEach { cnt[it-1]-- }

        lost.forEach {
            if(cnt[it-1]==0){
                if(it-2>=0&&cnt[it-2]==2) cnt[it-2]--
                else if(it<n&&cnt[it]==2) cnt[it]--
                else answer--
            }
        }
        return answer
    }
}