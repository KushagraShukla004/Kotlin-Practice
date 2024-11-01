//Write kotlin program using user-defined to display sum of n numbers
fun add(num:Int):Int{
    return if(num==0) 0; else num+add(num-1)
}
fun main() {
    print("Enter the number: ")
    val range= readln().toInt()
    println("Sum of 1-$range is : ${add(range)}")
}