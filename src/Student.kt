//example program: Create a student class to display whether a student has passed or failed
//------------------------------------------------------------------------------------------
//class Student {
//    private var isPass: Boolean = false
//
//    fun studyTrue(){
//        isPass=true
//    }
//    fun studyFalse(){
//        isPass=false
//    }
//    fun studentResult(s:String){
//        if (isPass){
//            println("$s Student has Passed.")
//        }else{
//            println("$s Student did not pass.")
//        }
//    }
//}
//
//fun main(){
//    val s1=Student()
//    val s2=Student()
//    s1.studyTrue()
//    s2.studyFalse()
//    s1.studentResult("s1")
//    s2.studentResult("s2")
//}

//----------------------------------------------------------------------
//Example for Primary Constructor
//----------------------------------------------------------------------

//fun main(args: Array<String>){
//    val stud1= Student("David",500)
//    println("First Name: ${stud1.firstName}")
//    println("Marks: ${stud1.marks}")
//}
//// we are using this class to call our (parameterized) "Student" constructor.
//class Student(val firstName:String, val marks:Number){
//}
//----------------------------------------------------------------------
//Example for Primary Constructor with "init" block
//----------------------------------------------------------------------
//fun main(args: Array<String>){
//    val stud1= Student("David",500)
//}
//// we are using this class to call our (parameterized) "Student" constructor.
//class Student(val firstName:String?, val marks:Int){
//    var firstName1 : String?=null
//    var marks1: Int=0
//
//    //initializer block
//    init {
//        firstName1=firstName
//        marks1=marks
//        println("First Name: $firstName1")
//        println("Marks: $marks1")
//    }
//}
//----------------------------------------------------------------------------
//Example of Secondary Constructor (with one constructor)
//----------------------------------------------------------------------------
//fun main(args: Array<String>)
//{
//    Add(5, 6)
//}
//
//// class with one secondary constructor
//class Add
//{
//    constructor(a: Int, b:Int)
//    {
//        val c = a + b
//        println("The sum of numbers 5 and 6 is: $c")
//    }
//}
//----------------------------------------------------------------------------
//Example of Secondary Constructor (with 2 or more constructors)
//----------------------------------------------------------------------------
fun main(args: Array<String>) {
    employee(18018, "Sagnik")
    employee(11011,"Praveen",600000.5)
}
class employee {
    constructor (emp_id : Int, emp_name: String ) {
        val id: Int = emp_id
        val name: String = emp_name
        print("Employee id is: $id, ")
        println("Employee name: $name")
        println()
    }

    constructor (emp_id : Int, emp_name: String ,emp_salary : Double) {
        val id: Int = emp_id
        val name: String = emp_name
        val salary : Double = emp_salary
        print("Employee id is: $id, ")
        print("Employee name: $name, ")
        println("Employee name: $salary")
    }
}
