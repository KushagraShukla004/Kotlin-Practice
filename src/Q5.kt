//Write kotlin program using user-defined function to display Prime number from user-defined range
fun isPrime(number: Int): Boolean {
    var count = 0
    for (i in 1 until number) {
        if (number % i == 0) {
            count++
        }
    }
    return count == 2
}

fun main() {
    print("Enter the range: ")
    val range = readln().toInt()

    println("Prime numbers from 1 to $range are:")
    for (i in 1 until range) {
        if (isPrime(i)) {
            println(i)
        }
    }
}
