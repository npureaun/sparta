import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        val answer: IntArray = intArrayOf(100,100,0,0)
        for(i in wallpaper.indices){
            if(wallpaper[i].any { it=='#' }){
                answer[0]= min(answer[0],i)
                answer[1]= min(answer[1], wallpaper[i].indexOf("#"))

                answer[2]= max(answer[2],i+1)
                answer[3]= max(answer[3], wallpaper[i].lastIndexOf("#")+1)
            }
        }

        return answer
    }
}