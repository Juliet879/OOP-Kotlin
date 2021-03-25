fun main() {
//    object instance of class Huma
    var diana = Human("Diana Jaber ",28,64)
    diana.eat(5)
    println(diana.weight)

    diana.speak("I am smart and awesome")

    diana.birthday()

//instance of a data class user
    var mike = User("Michael","Ishmael","mish@gmail.com","0702957483","iuvgbd")
    println(mike.email)
    println(mike.password)




}
class Human(var name:String, var age:Int, var weight: Int){
    fun eat(foodWeight: Int):Int{
        println("I am eating $foodWeight kgs of food")
        weight = weight + foodWeight
        return weight
    }

    fun speak(speech:String){
        println(speech)
    }

    fun birthday(){
      println(++age)

    }
}

data class User(var firstName:String ,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}