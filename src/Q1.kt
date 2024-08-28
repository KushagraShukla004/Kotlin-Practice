fun main() {
    print("Enter the number: ")
    val number= readlnOrNull()?.toInt()
    var factorial=1
    // number!! means non-null variable
    for (i in 1..number!!){
        factorial*=i
    }
    println("Factorial of $number is : $factorial")
}