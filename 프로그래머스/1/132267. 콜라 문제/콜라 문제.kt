class Solution {
    var dp = intArrayOf()
    tailrec fun solution(a: Int, b: Int, n: Int, answer: Int = 0): Int {
        dp = IntArray(n) { 0 }
        return Recursive(a, b, n)
    }

    tailrec fun Recursive(a: Int, b: Int, n: Int, answer: Int = 0): Int {
        if (n < a) return answer
        else if (dp[(n / a * b) + (n % a)] == 1) return answer
        else {
            dp[(n / a * b) + (n % a)] = 1
            return Recursive(a, b, (n / a * b) + (n % a), answer + (n / a) * b)
        }
    }
}