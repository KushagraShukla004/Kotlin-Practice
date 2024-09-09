fun reverse(num:Int){
    var temp = num
    var rev=0
    while (temp>0){
        val digit = temp % 10
        rev= (rev*10) + digit
        temp = temp / 10
    }
    println("Reverse of $num is = $rev")
}

fun main(){
    print("Enter the number: ")
    val num1= readln().toInt()
    reverse(num1)
}