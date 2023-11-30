package chapter10

//Food types
open class Food

class VeganFood: Food()

//Sellers
interface Seller<out T>

class FoodSeller: Seller<Food>

class VeganFoodSeller: Seller<VeganFood>

//Consumers
interface Consumer<in T>

class Person: Consumer<Food>

class Vegan: Consumer<VeganFood>

fun main() {
    var foodSeller: Seller<Food>
    foodSeller = FoodSeller()
    foodSeller = VeganFoodSeller()

    var veganFoodConsumer: Consumer<VeganFood>
    veganFoodConsumer = Vegan()
    veganFoodConsumer = Person()
}