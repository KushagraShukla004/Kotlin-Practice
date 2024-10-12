fun main(){
    print("Enter the number: ")
    var number = readln().toInt()
    var sum=0
    for (i in 1 ..< number){
        if(number%i == 0){
            sum+=i
        }
    }
    if(sum==number){
        print("$number is a Perfect Number.")
    }else{
        print("$number is not a Perfect Number.")
    }
}