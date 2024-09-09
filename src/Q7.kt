fun main(){
    print("Enter the starting range of numbers: ")
    val start= readln().toInt()
    print("Enter the ending range of numbers: ")
    val end= readln().toInt()
    val result=sum(start,end)
    print("Sum of number from $start to $end = $result")
}
fun sum(start:Int, end:Int):Int{
    var add=0
    for (i in start .. end){
        add+=i
    }
    return add
}