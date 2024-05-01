class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val str=StringBuilder()

        ingredient.forEach {
            str.append(it)
            if(str.length>=4&&str.substring(str.length-4)=="1231") {
                answer++
                str.setLength(str.length-4)
            }
        }
        return answer
    }
}