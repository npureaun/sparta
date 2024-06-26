class Solution {
    fun solution(s: String): IntArray {
        var loop=0
        var count=0
        var str=StringBuilder(s)
        while (str.toString()!="1"){
            ++loop
            
            count+= str.count { it.digitToInt() == 0 }
            str=StringBuilder(str.filter { it.digitToInt() != 0 }
                .length.toString(2))
        }
        return  intArrayOf(loop,count)
    }
}