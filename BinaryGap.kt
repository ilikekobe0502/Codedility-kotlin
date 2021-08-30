fun solution(N: Int): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    var gap = 0
        val binary = N.toString(radix = 2)
        val cacheList = arrayListOf<Int>()
        var cache = 0
        binary.forEach {
        
            if (it == '1') {
                cacheList.add(cache)
                cache = 0
            } else {
                cache += 1
            }
        }
        cacheList.forEach {
            if (it > gap)
                gap = it
        }
        return gap
}
