class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer:MutableSet<Int> = mutableSetOf()
        for(i in 0.until(numbers.size-1))
            for (j in (i+1).until(numbers.size))
                answer.add(numbers[i]+numbers[j])

        return answer.sorted().toIntArray()
    }
}