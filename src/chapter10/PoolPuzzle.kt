package chapter10

class PetOwner<T: Pet>(t: T){
    val pets = mutableListOf(t)

    fun add(t: T){
        pets.add(t)
    }

    fun remove(t: T){
        pets.remove(t)
    }
}

fun main(){
    val catFuzz = Cat("Fuzz")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny")
    val catOwner = PetOwner(catFuzz)
    catOwner.add(catKatsu)
    for (pet in catOwner.pets) println(pet.name)
}