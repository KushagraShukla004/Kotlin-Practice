fun isArmstrong(number: Int): Boolean {
    val digits = number.toString().length // Number of digits
    var temp = number
    var sum = 0
    while (temp > 0) {
        val digit = temp % 10
        sum += Math.pow(digit.toDouble(), digits.toDouble()).toInt() // Raise each digit to the power of the number of digits
        temp /= 10
    }
    return sum == number
}

fun main() {
    print("Enter the range: ")
    val num = readln().toInt()
    print("Armstrong numbers from 1 to $num are: ")
    for (i in 1 until num) {
        if (isArmstrong(i)) {
            print("$i ")
        }
    }
}
