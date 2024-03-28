import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var w=0; var h=0;
        sizes.forEach {
            var maxEle=max(it[0],it[1])
            var minEle= min(it[0],it[1])
            w= max(w, maxEle)
            h= max(h,minEle)
        }
        return w*h
    }
}