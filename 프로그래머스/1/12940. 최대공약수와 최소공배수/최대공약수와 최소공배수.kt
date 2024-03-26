import kotlin.math.max
import kotlin.math.min

class Solution {

    fun solution(n: Int, m: Int)= intArrayOf(gcd(n,m), lcm(n,m))

    fun lcm(n: Int, m: Int)= (n*m)/gcd(n,m)
    
    fun gcd(n: Int, m: Int): Int{
        var r:Int=0;var a= max(n,m); var b= min(n,m)
        while (b!=0){ r= a%b; a=b; b=r}
        return a
    }
}