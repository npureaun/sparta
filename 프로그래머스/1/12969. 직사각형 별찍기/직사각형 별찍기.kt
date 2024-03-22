  fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
         (1..a*b).forEach { print(if(it%a==0)"*\n" else "*") }
    }