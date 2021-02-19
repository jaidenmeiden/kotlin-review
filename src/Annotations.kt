package intro
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/
@JvmOverloads fun sum(a:Int=0, b:Int=0, c:Int=0): Int {
    return a + b + c
}