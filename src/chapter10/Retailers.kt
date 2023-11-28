package chapter10

interface Retailer<out T>{
    fun sell(): T
}

class CatRetailer: Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell cat")
        return Cat("")
    }
}

class DogRetailer: Retailer<Dog>{
    override fun sell(): Dog {
        println("Sell dog")
        return Dog("")
    }
}

class FishRetailer: Retailer<Fish>{
    override fun sell(): Fish {
        println("Sell fish")
        return Fish("")
    }
}

fun main(){
    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()
}