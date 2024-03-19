class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer= arrayListOf<Int>()
        var min: Int= 999999999
        var isIndex: Int=0
        arr.forEachIndexed { index, i ->
            if(min>i) {min=i; isIndex=index}
        }
        arr.forEachIndexed { index, i ->
            if(index!=isIndex&&min!=i) answer.add(i)
        }
        return if(answer.isEmpty()) intArrayOf(-1)else answer.toIntArray()
    }
}