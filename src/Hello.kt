package intro

// Hello world! and variables
fun main() {
    val name = "Jaiden"
    println("Hello, $name!")

    var question:String = "Life, the universe, " + "and everything"
    println("$question")
    question = "Hi!"
    println(question)
    "Hello! My friend!".also { question = it }
    println(question)
}

// Functions and classes
fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int) =  if (a > b) a else b

fun displayMax(a: Int, b: Int) {
    println(max1(a, b))
}

fun displayMax2(a: Int, b: Int): Unit {
    println(max2(a, b))
}

fun topLevel() = 1

class A {
    fun local() = 3
}

fun other() {
    fun local() = 3
}