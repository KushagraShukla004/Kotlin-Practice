fun main(){
    print("Enter the number: ")
    var number= readln().toInt()
    val temp = number
    var sum=0
    while(number!=0){
        val digit = number % 10
        sum += (digit * digit * digit)
        number /= 10
    }

    if (sum == temp){
        println("$temp is an Armstrong number.")
    }else{
        println("$temp is not an Armstrong number.")
    }
}