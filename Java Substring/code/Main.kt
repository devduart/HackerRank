import java.io.*
import java.util.*
import java.util.Scanner

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val `in` = Scanner(java.lang.System.`in`)
    val S: String = `in`.next()
    val start: Int = `in`.nextInt()
    val end: Int = `in`.nextInt()
    val S1: String = S.substring(start, end)
    println(S1)


}
