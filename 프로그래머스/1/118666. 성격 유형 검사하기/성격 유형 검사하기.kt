class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val map = mutableMapOf('R' to 0, 'T' to 0, 'C' to 0, 'F' to 0,
            'M' to 0, 'J' to 0, 'N' to 0, 'A' to 0)
        for(i in choices.indices) {
            if(choices[i]>4){
                val key = survey[i].last()
                map[key]=map.getValue(key)+(choices[i]-4)
            }
            else if(choices[i]<4){
                val key = survey[i].first()
                map[key]=map.getValue(key)+(4-choices[i])
            }
        }

        var answer = ""
        answer += if(map.getValue('R')>=map.getValue('T')) "R" else "T"
        answer += if(map.getValue('C')>=map.getValue('F')) "C" else "F"
        answer += if(map.getValue('J')>=map.getValue('M')) "J" else "M"
        answer += if(map.getValue('A')>=map.getValue('N')) "A" else "N"

        return answer
    }
}