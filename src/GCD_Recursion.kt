//Write a kotlin program using recursive function for GDC(Greatest Common Divisor)
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
    print("Enter first number: ")
    val num1 = readln().toInt()

    print("Enter second number: ")
    val num2 = readln().toInt()

    val result = gcd(num1, num2)
    println("The GCD of $num1 and $num2 is: $result")
}
