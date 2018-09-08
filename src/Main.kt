/**
 * Created by Josef Matson on 7/31/2017.
 */
fun main(args:Array<String>) {
    var output:String = ""
    var I = 0
    for (i in 1..1000) {
        I += 1
        output = ""
        if (I % 4 == 0) {
            output = "fizz"
        }

        if (I % 3 == 0) {
            output += "buzz"
        }
        if (output == ""){
            output = I.toString()
        }
        println(output)
    }
}
