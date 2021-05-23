package com.wales

import com.wales.obj.Person
import com.wales.utils.Fish
import com.wales.utils.Math

//import java.lang.Thread.yield


fun printNum(vararg number: Int) {
    for (i in number) {
        println(i)
    }
}

val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

fun main(args: Array<String>) {
    val person = Person("Wales", 'M')
    person.sayGreeting()
    person.age = 30
    person.printInformation()

    // var x = yield(1)
    val (name4, species4, colors4) = Fish("Harry", "halibut","red")
    println(name4);


    val person2: Person = Person("Wells", 'F', 40)
    person2.printInformation()
    val math = Math()
    math.print99()
    math.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("please select R, G or B:")
    val color = when (readLine()?.toUpperCase()) {
        "R" -> "Red"
        "G" -> "Green"
        "B" -> "Blue"
        else -> "nothing"
    }

    println("you have chosen $color")
    var i = 3
    do {
        println(i)
    } while (i-- > 0)
    printNum(1, 2, 3, 4, 5)
    println(sumLambda(1, 2))  // 输出 3

    val ia: IntArray = intArrayOf(3, 5, 7)
    for (i in ia) {
        println(i)
    }

    val ia2: IntArray = intArrayOf(120, 30, 15, 27, 66)

    ia2.filter { it > 50 }         // 留下大於50的元素
        .sortedBy { it }            // 依照大小排序
        .map { it / 10 }            // 元素值除以10
        .forEach { print("$it-") }
}

