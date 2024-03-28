import kotlin.math.max

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var w=0; var h=0;
        sizes.forEach {
            it.sort()
            w= max(w, it[0])
            h= max(h, it[1])
        }
        return w*h
    }
}