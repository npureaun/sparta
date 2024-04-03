class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var st=s.reversed()
        for(i in st.indices)
        {
            val distance=st.indexOf(st[i],i+1)
            answer+=if(distance!=-1) distance-i else -1
        }
        return answer.reversedArray()
    }
}