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
fun main(args: Array<String>){
    val stud1= Student("David",500)
}
// we are using this class to call our (parameterized) "Student" constructor.
class Student(val firstName:String?, val marks:Int){
    var firstName1 : String?=null
    var marks1: Int=0

    //initializer block
    init {
        firstName1=firstName
        marks1=marks
        println("First Name: $firstName1")
        println("Marks: $marks1")
    }
}

