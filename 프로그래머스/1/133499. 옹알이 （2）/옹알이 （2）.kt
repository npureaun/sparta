class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
       babbling.forEach {
           val possible = mutableMapOf("aya" to false, "ye" to false, "woo" to false,  "ma" to false)
           var str=""
           var len=0
           it.forEach { i->
               str+=i
               if(possible[str]==false)
               {
                   possible.forEach{possible[it.key]=false}
                   possible[str]=true
                   len+=str.length
                   str=""
               }
               else if(possible[str]==true)
               {
                   possible[str]=false
                   str=""
               }
           }
           if(len==it.length)answer++
       }
        return answer
    }
}