class Solution {
    fun solution(n: Int, m: Int)= intArrayOf(gcd(n,m), n*m/gcd(n,m))
    private tailrec fun gcd(n: Int, m: Int):Int=if(m<=0) n else gcd(m, n%m)
}