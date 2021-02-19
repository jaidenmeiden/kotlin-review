package intro

fun main() {
    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))
    println(listOf(1, 2, 3).joinToString(postfix = "."))
    displaySeparator('#', 5)
    displaySeparator('$')
    displaySeparator()
    displaySeparator(size = 7, character = '5')
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
    println()
}