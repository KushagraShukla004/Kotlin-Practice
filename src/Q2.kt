//Write kotlin program using user-defined function to display Fibonacci Series from user-defined range
fun printFib(number: Int){
    var n1=0
    var n2=1
    print("$n1 $n2")
    for(i in 2..number){
        val n3 = n1 + n2
        n1=n2
        n2=n3
        print(" $n3 ")
    }
}

fun main(){
    print("Enter the range: ")
    val range = readln().toInt()
    printFib(range)
}