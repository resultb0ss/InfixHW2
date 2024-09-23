fun main() {
    var viktor = Person("Виктор")

    viktor say "Добрый день"
}

class Person(var name:String){

    infix fun say(message: String){
        println("$name сказал $message")
    }
}