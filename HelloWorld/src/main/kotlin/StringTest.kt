fun main(args: Array<String>) {
    val change = 6.77

    println("your change is $change")
    println("your change is $$change")
    println("your change is \$change")

    val num = 20
    val dom = 10

    println("the value of $num divided by $dom is ${num/dom}")

    //triple cottet string
    val poetname = "Kobi guru"
    val kobita  = """Gogone Goroje Megh Ghono Borosha
                    |Kole eka boshe Achi Nahi bhorosha
                    |Rashi Rahi Bhara bhara Dhan Kata Holo Shara
                    |$poetname
    """.trimMargin()
    println(kobita)

}

