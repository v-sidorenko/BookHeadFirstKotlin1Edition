package chapter08

class BadException : Exception()

fun myFunction(test: String){
    try {
        print("t")
        print("h")
        riskyCode(test)
        print("r")
        print("o")
    }
    catch (e: BadException){
        print("a")
    }
    finally {
        print("w")
        print("s")
    }
}

fun riskyCode(test: String){
    if (test == "Yes") {
        throw BadException()
    }
}

fun main(){
    print("Yes - ")
    myFunction("Yes")
    println()
    print("No - ")
    myFunction("No")
}