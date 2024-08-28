fun findHCF(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1
}

fun findLCM(a: Int, b: Int, hcf: Int): Int {
    return (a * b) / hcf
}

fun main() {
    print("Enter the first number: ")
    val number1 = readln().toInt()

    print("Enter the second number: ")
    val number2 = readln().toInt()

    if (number1 <= 0 || number2 <= 0) {
        println("Please enter valid positive integers.")
        return
    }

    val hcf = findHCF(number1, number2)
    val lcm = findLCM(number1, number2, hcf)

    println("HCF of $number1 and $number2 is: $hcf")
    println("LCM of $number1 and $number2 is: $lcm")
}
