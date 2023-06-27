package chapter03

fun main(){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoise = getGameChoise(options)
    val userChoice = getUserChoise(options)
    printResult(gameChoise, userChoice)

}

fun getGameChoise(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoise(optionsParam: Array<String>): String{
    var isValidChoise = false
    var userChoise = ""

    while (!isValidChoise) {
        print("Please enter one of the following:")
        for (option in optionsParam) print(" $option")
        println(".")

        val userInput = readLine()

        if(userInput != null && userInput in optionsParam){
            isValidChoise = true
            userChoise = userInput
        }

        if (!isValidChoise) println("You must enter a valid choice.")
    }

    return userChoise.toString()

}

fun printResult(gameChoice: String, userChoice: String){
    val result: String

    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper"))
        result = "You win!"
    else result = "You lose!"
    print("You chose $userChoice. Game chose $gameChoice. $result")
}