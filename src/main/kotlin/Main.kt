fun main() {
 val myName = Human("Lynet",19,50)
    myName.eat(2)
     myName.speak("I enjoy learning kotlin")
    myName.birthday()





 val myPhone = Phone("Lynet","Musembi","musembilinet@gmail.com",798032314,"melody")
 println(myPhone.firstName)
    println(myPhone.email)


}
class Human(var name: String,var age: Int,var weight: Int) {


    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
         weight += foodWeight
        println(weight)
    }


    fun speak(speak: String) {
     println(speak)
    }
    fun birthday() {
        age +=1
        println(age)

    }
}
data class Phone(var firstName: String,var lastName: String,var email: String,var phoneNumber: Int,var password: String)