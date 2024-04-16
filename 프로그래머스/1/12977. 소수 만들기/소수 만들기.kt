class Solution {
    fun isPrime(n: Int):Boolean {
        if (n < 2) return false
        var i = 2
        while (i * i <= n) {
            if (n % i++ == 0) return false
        }
        return true
    }

    fun solution(nums: IntArray): Int {
        var answer = 0
        for(i in nums.indices)
            for(j in i+1 until nums.size)
                for(n in j+1 until nums.size)
                    if(isPrime(nums[i]+nums[j]+nums[n]))answer++
        return answer
    }
}