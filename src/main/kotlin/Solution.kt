class Solution {
    fun getStringDistance(str1: String, str2: String): Int {
        val str1Len = str1.length
        val str2Len = str2.length
        var min = str1Len
        var max = str2Len
        var diff = 0
        if (str2Len < str1Len) {
            max = str1Len
            min = str2Len
        }
        val top = min - 1
        for (idx in 0..top) {
            if (str1[idx]!=str2[idx]) {
                diff++
            }
        }
        return diff + (max - min)
    }
}