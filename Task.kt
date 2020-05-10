fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculateResult(valueA, valueB, valueC)
    val resultB = calculateResult(valueA, valueB, null)

    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int{
    // TODO 1
    val resultA = (valueA + (valueB - (valueC?:100)))
    return (resultA)
}

/*fun generateResult(resultA: Int) = "Result is $resultA"*/

fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO

    val valueA = valueA
    val valueB = valueB
    val valueCNotNull = if (valueC == null){
        50
    } else {
        valueC
    }

    val resultB = valueA + (valueB - (valueC ?: 50))
    return (resultB)
}
/*fun generateResult(resultB: Int) = "Result is $resultB"*/