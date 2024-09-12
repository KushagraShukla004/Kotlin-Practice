class Student {
    private var isPass: Boolean = false

    fun studyTrue(){
        isPass=true
    }
    fun studyFalse(){
        isPass=false
    }
    fun studentResult(s:String){
        if (isPass){
            println("$s Student has Passed.")
        }else{
            println("$s Student did not pass.")
        }
    }
}

fun main(){
    val s1=Student()
    val s2=Student()
    s1.studyTrue()
    s2.studyFalse()
    s1.studentResult("s1")
    s2.studentResult("s2")
}