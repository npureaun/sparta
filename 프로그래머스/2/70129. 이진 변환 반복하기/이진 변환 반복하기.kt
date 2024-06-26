class Solution {
    fun solution(s: String): IntArray {
        var loop=0
        var count=0
        var str=s
        while (str!="1"){
            ++loop
            count+= str.count { it.digitToInt() == 0 }
            str=str.filter { it.digitToInt() != 0 }.length.toString(2)
        }
        return  intArrayOf(loop,count)
    }
}