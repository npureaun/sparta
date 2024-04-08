class Solution {
    tailrec fun solution(a: Int, b: Int, n: Int, answer: Int=0): Int {
        if (n < a) return answer
        return solution(a, b, (n / a * b) + (n % a), answer + (n / a) * b)
    }
}