fun main(){
var man=Human("Mercy otieno",19,45)
man.eat(30)
    println(man.weight)
    man.speak("My name is Mercy")
    println(man.name)
man.birthday()
    println(man.age)

var use=User("Mercy" ,"Opiyo","mercyapiyo@gmail.com","Mercy-24",348959898)
use.email
    println(use.email)
use.passWord
    println(use.phoneNumber)



}
class Human(var name:String,var age:Int,var weight:Int){
fun eat(foodWeight:Int){
var stmt="I am eating $foodWeight kgs of food"
    weight +=foodWeight
println(stmt)
}
    fun speak(speech:String){
println(speech)
    }
    fun birthday(){
        age++
    }




}
data class User(var firstName:String,var lastName:String,var email:String,var passWord:String,var phoneNumber:Int)