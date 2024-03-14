import kotlin.math.*

class Solution {
    fun solution(n: Long)=
        if(sqrt(n.toDouble()).toInt().toDouble().pow(2).toLong()==n){ (sqrt(n.toDouble())+1).pow(2).toLong() }
        else{-1}
}