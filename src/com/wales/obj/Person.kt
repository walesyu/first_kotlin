package com.wales.obj

class Person(var name: String) {

    private var greeting: String = ""
    private var gender: Char = 'U'
        set(value) {
            greeting = if (value == 'M') "Hello" else "Hi"
            field = value
        }
    private val sex: String
        get() = "(${if (gender == 'M') "Male" else "Female"})"

    var age: Int = 0

    constructor(name: String, gender: Char) : this(name) {
        this.gender = gender
    }

    constructor(name: String, gender: Char, age: Int) : this(name, gender) {
        this.age = age
    }

    fun sayGreeting() {
        println("Hello, $name!")
        gender = 'M'
        println("Hello, $greeting")
    }

    fun printInformation() {
        println("Info: $name $sex, $age 歲")
    }
}
