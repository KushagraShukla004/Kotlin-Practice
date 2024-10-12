//Write kotlin program using user-defined function to display reverse of a number
fun reverse(num:Int):Int {
    var temp = num
    var rev=0
    while (temp>0){
        val digit = temp % 10
        rev= (rev*10) + digit
        temp = temp / 10
    }
    return rev
}

fun main(){
    print("Enter the number: ")
    val num1= readln().toInt()
    println("Reverse of $num1 is = ${reverse(num1)}")
}