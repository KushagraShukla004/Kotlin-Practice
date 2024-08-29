fun main() {
    print("Enter the number: ")
    val number= readln().toInt()
    //used LongInt (L) for storing value uptil 20 factorials
    var factorial=1L
    for (i in 1..number){
        factorial*=i
    }
    println("Factorial of $number is : $factorial")
}