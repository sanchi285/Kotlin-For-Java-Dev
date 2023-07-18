package nullreference

fun main (args: Array<String>){
    val str: String? = null
    if(str!=null){
        str.toUpperCase();
    }

    //
    println( " this is a nullable  ${str?.toLowerCase()}")

    /*
    val str: String?  = Bank?.Accounttype?.Member?.name :)
    */

    //set a default value with alvis operator

    var str2 : String? = null
    val str3: String = str2 ?: "this is the default value"
    println(str3)

    val something: Any = arrayOf(1,2,3,4)

    //safe cast Operator
    val str5: String?  = something as? String
    println(str5)
}