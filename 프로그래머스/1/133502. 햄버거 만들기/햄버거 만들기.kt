class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val str=""
        val st= mutableListOf<Int>()

        ingredient.forEach {
            st.add(it)
            if(st.size>=4&&it==1) {
                var mul=1
                var add=0
                repeat(4) { cnt ->
                    add+=mul*st[(st.size-1)-cnt]
                    mul*=10
                }
                if(add==1231) {
                    repeat(4){st.removeLast()}
                    answer++
                }
            }
        }
        return answer
    }
}