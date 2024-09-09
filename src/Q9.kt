fun main(){
    print("Enter the number: ")
    val number= readln().toInt()
    armstrong(number)
}

fun armstrong(number:Int){
    var temp = number
    var sum=0
    while(temp!=0){
        val digit = temp % 10
        sum += (digit * digit * digit)
        temp /= 10
    }

    if (sum == number){
        println("$number is an Armstrong number.")
    }else{
        println("$number is not an Armstrong number.")
    }
}