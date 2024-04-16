class Solution {
    private fun isPrime(n: Int):Boolean =
        (2..n / 2).count { n%it==0 }==0

    fun solution(nums: IntArray): Int {
        var answer = 0
        for(i in nums.indices)
            for(j in i+1 until nums.size)
                for(n in j+1 until nums.size)
                    if(isPrime(nums[i]+nums[j]+nums[n]))answer++
        return answer
    }
}
