package chapter06

abstract class Appliance {
    var pluggedIn = true
    abstract val color: String

    abstract fun consumePower()
}

class CofeeMaker: Appliance() {
    override val color = ""
    var cofeeLeft = false

    override fun consumePower() {
        println("Consuming power")
    }

    fun fillWithWater() {
        println("Fill with water")
    }

    fun makeCofee() {
        println("Make the cofee")
    }
}