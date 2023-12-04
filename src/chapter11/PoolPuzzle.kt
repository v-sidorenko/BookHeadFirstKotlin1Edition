package chapter11

fun unless(condition: Boolean, code: () -> Unit) {
    if (!condition) {
        code()
    }
}

fun main() {
    val options = arrayOf ("Red", "Amber", "Green")
    var crossWalk = options[(Math.random() * options.size).toInt()]
    if (crossWalk == "Green") {
        println("Walk!")
    }
    unless (crossWalk == "Green") {
        println("Stop!")
    }
}