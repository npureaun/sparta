class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val map = linkedMapOf("R" to 0, "T" to 0, "C" to 0, "F" to 0,
            "J" to 0, "M" to 0, "A" to 0, "N" to 0)
        for(i in choices.indices) {
            if(choices[i]>4){
                val key = survey[i].last().toString()
                map[key]=map.getValue(key)+(choices[i]-4)
            }
            else if(choices[i]<4){
                val key = survey[i].first().toString()
                map[key]=map.getValue(key)+(4-choices[i])
            }
        }

        var answer = ""
        val li=map.toList()
        for(i in li.indices step 2) {
            answer+=if(li[i].second>=li[i+1].second)li[i].first else li[i+1].first
        }
        return answer
    }
}