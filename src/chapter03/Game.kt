package chapter03

fun main(){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoise = getGameChoise(options)
    println(getUserChoise(options))

}

fun getGameChoise(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoise(optionsParam: Array<String>): String{
    print("Please enter one of the following:")
    for (option in optionsParam) print(" $option")
    println(".")

    val userInput = readLine()
    return  userInput.toString()
}