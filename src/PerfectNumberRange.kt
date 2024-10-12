fun isPerfectNumber(number: Int): Boolean {
    var sum = 0
    for (i in 1..<number) {
        if (number % i == 0) {
            sum += i
        }
    }
    return sum == number
}

fun main() {
    print("Enter the end of the range: ")
    val end = readln().toInt()

    println("Perfect numbers between 1 and $end:")
    for (num in 1..end) {
        if (isPerfectNumber(num)) {
            println(num)
        }
    }
}
