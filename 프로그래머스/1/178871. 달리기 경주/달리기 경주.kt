class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playersList = players.toMutableList()
        var rank=0; val map=players.map {it to rank++  }.toMap().toMutableMap()
        callings.forEach { calledPlayer ->
            val currentIndex = map[calledPlayer]!!
            if (currentIndex > 0) {
                val previousPlayer = playersList[currentIndex - 1]
                playersList[currentIndex - 1] = calledPlayer
                playersList[currentIndex] = previousPlayer
                map[calledPlayer] = currentIndex - 1
                map[previousPlayer] = currentIndex
            }
        }
        return playersList.toTypedArray()
    }
}