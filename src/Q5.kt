fun isPrime(number: Int): Boolean {
    if (number <= 1){
        return false
    }

    for (i in 2..< number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    print("Enter a number: ")
    val number = readln().toInt()

    if (isPrime(number)) {
        println("$number is a Prime Number.")
    } else {
        println("$number is not a Prime Number.")
    }
}
