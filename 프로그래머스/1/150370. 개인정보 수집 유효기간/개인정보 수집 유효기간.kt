class Solution {
    fun getTotalDays(year: Int, month: Int, day: Int)
            : Int = ((year * 12) * 28) + (month * 28) + (day - 1)

    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val dateMap = mutableMapOf<String, Int>()
        terms.forEach {
            val pair = it.split(" ")
            dateMap[pair.first()] = pair.last().toInt()
        }

        val nowDate = today.split(".").map { it.toInt() }
        val nowDays: Int = getTotalDays(nowDate[0], nowDate[1], nowDate[2])
        println("==$nowDays")
        println()

        for(i in privacies.indices){
            val totalDate = privacies[i].split(".", " ")
            val totalDays = getTotalDays(
                totalDate[0].toInt()
                , (totalDate[1].toInt() + dateMap[totalDate[3]]!!)
                , totalDate[2].toInt())
            if(totalDays<=nowDays) answer+=i+1
        }
        return answer
    }
}
