package chapter12

fun main() {
    val groceries = listOf(
            Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
            Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
            Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
            Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
            Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    //Write the code below to find out how much will be spent on vegetables.
    val sumOfVegetables = groceries
        .filter { it.category == "Vegetable" }
        .sumOf { it.unitPrice * it.quantity }
    println("sumOfVegetables: $sumOfVegetables")

    //Create a List containing the name of each item whose total price is less than 5.0
    val listOfNamesPriceLess5 = groceries
        .filter { it.unitPrice * it.quantity < 5.0 }
        .map { it.name }
    println("listOfNamesPriceLess5: $listOfNamesPriceLess5")

    //Print the total cost of each category.
    val mapOfCategoryCost = groceries
            .groupBy { it.category }
            .mapValues { it.value.sumOf { item -> item.unitPrice * item.quantity } }
    println("mapOfCategoryCost: $mapOfCategoryCost")

    //Print the name of each item that doesn’t come in a bottle, grouped by unit.
    val mapOfNonBottleUnits = groceries
            .filterNot { it.unit == "Bottle" }
            .groupBy { it.unit }

    mapOfNonBottleUnits.forEach {
        println("${it.key}:")
        it.value.forEach { println("    ${it.name}") }
    }
}