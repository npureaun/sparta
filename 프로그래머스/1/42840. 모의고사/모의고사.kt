class Solution {
    private fun setList():List<IntArray> = 
        listOf(intArrayOf(1, 2, 3, 4, 5), 
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5), 
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)) 
    
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val user=setList()
        val score= intArrayOf(0,0,0)
        for(i in answers.indices)
        {
            user.forEachIndexed { j, it ->
                if(answers[i]==it[i%it.size]) score[j]++ }
        }
        for(i in score.indices) if(score[i]==score.maxOf { it }) answer+=i+1
        return answer.sortedArray()
    }
}