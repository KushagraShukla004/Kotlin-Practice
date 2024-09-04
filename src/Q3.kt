fun main(){
    print("Enter the number: ")
    var number = readln().toInt()
    var sum=0
    if(number==1 || number==0){
        println("$number is not a Perfect Number since they have only itself as a factor.")
        return
    }
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