import twosum.TwoSumSolution

fun main(args: Array<String>) {

    var passing = test {
        toTest = TwoSumSolution()

        testData(intArrayOf(2, 7, 11, 15))
        testData(9)
    }.run()

    var out: Any

    if (passing is Array<*>) {
        out = passing.contentToString()
    } else { out = passing }

    println("Passing? $out")

    //TwoSumSolution().twoSum(intArrayOf(2, 7, 11, 15), 9)
}

