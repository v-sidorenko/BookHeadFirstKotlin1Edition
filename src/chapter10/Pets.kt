package chapter10

abstract class Pet(var name: String)

class Cat(name: String): Pet(name)

class Dog(name: String): Pet(name)

class Fish(name: String): Pet(name)

class Contest<T: Pet>{
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore (t: T, score: Int = 0){
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores){
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}

fun main(){
    val catFuzz = Cat("Fuzz")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny")

    val catContest = Contest<Cat>()
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>()
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")
}
