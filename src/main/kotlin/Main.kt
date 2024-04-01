import java.net.PasswordAuthentication

fun main() {
    var car = Car("Subaru", "legacy", "UBA 133F", 0)
    val audi = Car("Audi", "A4", "KDN 387J", 0)
    val benz = Car("mercedes benz", "A4", "KDN 387J", 0)
    val eat = Human("yvonne",17,45.90)
    println(eat.foodWeight(54))
    println(speech(""))
    println(car.registration)
    println(audi.speed)
    audi.accelerate(50)
    println(audi.speed)
    audi.accelerate(30)
    println(audi.speed)
    audi.decelerate(30)
    println(audi.speed)
    audi.decelerate(40)
    println(audi.speed)
    benz.start()
val myBook =Book( "Smart Money Woman","Yvonne Martin",798)
    println(myBook.pages)
    println(myBook.title)
    println(myBook.author)
    println(calculate(29,10))
}
//define var in the constructor to enable you access the attributes.
//use the dot notation to access attributes and objects
//brackets,constructor function used to create objects from the class
class Car(var make: String, var model: String, var registration: String, var speed: Int) {
    //var is changeable//speed,model,make,registration are attributes//
    fun start() {
        println("vvvvvrooooom")
    }
    //class is a template for creating object.
    fun accelerate(acceleration: Int) {
        speed += acceleration
    }

    fun decelerate(deceleration: Int) {
        speed -= deceleration
    }

}
//Data Class is meant to hold data//we use val cause we are not going to reassign the field/values
data class Book(
    var title: String,
    var author: String,
    var pages:Int
)
data class Calculations(
    val sum :Int,
    val diff:Int,
    val product:Int,
    val quotient:Double
)

fun calculate(x: Int, y: Int): Calculations {
    val sum = x + y
    val diff = x - y
    val product = x * y
    val quotient = x.toDouble() / y

    return Calculations(sum, diff, product, quotient)
}

class Human (var name:String, var age:Int,var weight:Double) {
    fun foodWeight(foodWeight: Int) {
        weight += foodWeight
        println("I am eating $weight kgs of food")
    }
}
    fun speech(speech: String) {
        println("hello")
    }
data class people (
    val firstName: String,
    val lastName: String,
    val email : String,
    val phoneNumber: String,
    var password: String,
)
fun person (){
    val firstName: "yvonne",
    val lastName: "leila",
    println(firstName)
}

