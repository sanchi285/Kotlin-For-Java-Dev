fun main(args: Array<String>) {
    val f1: Float? = -3847.384F
    val f2: Float? = -3847.384F;

    val nonNullableShort = shortArrayOf(1,2,3,4,5,6)
    val shortArray2 : Array<Short> = arrayOf(1,2,3,4,5)

    //initialize a nullable array up to 40
    val nullArray = Array<Int?>(40){ i-> (i+1)*5}
    for (i in nullArray){println(i)}

    val x: String? = "I Am in Uppercase"
    val y = x?.toLowerCase()?:"x isn't null"

    val v = x?.let { it->it.toLowerCase().replace("am","not am") }
    println(v)

}