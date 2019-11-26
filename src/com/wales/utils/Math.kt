package com.wales.utils

data class Fish(val name: String, val species:String, val colors:String)

class Math {

    fun print99() {
        var str1 = ""
        var str2 = ""
        for (j in 1..9) {
            for (i in 2..9) {
                if (i < 6) str1 += "$i * $j = ${i * j}\t"
                else str2 += "$i * $j = ${i * j}\t"
            }
            str1 += "\n"
            str2 += "\n"
        }
        println("${"\t".repeat(4)}九\t九\t乘\t法\t表")
        println(str1)
        println(str2)
    }

    fun sum(vararg num: Int) {
        var total = 0
        for (i in num) {
            total += i
        }
        println(total)
    }
}