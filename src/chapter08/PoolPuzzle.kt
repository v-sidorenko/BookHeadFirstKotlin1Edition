package chapter08

class Duck(val height: Int? = null){
    fun quack(){
        println("Quack! Quack!")
    }
}

class MyDucks(var myDucks: Array<Duck?>){
    fun quack(){
        for (duck in myDucks){
            duck?.let{
                it.quack()
            }
        }
    }

    fun totalDuckHaight(): Int {
        var h: Int = 0
        for (duck in myDucks){
            h += duck?.height ?: 0
        }
        return h
    }
}

fun main(){
    val myDucks = MyDucks(arrayOf(Duck(4), Duck(), Duck(1), null))
    myDucks.quack()
    println(myDucks.totalDuckHaight())
}