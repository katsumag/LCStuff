fun main(args: Array<String>) {
    println("Hello World!")

    val passing = test {
        toTest(TwoSumSolution())
        println("Object loaded")
        testData(intArrayOf(2, 7, 11, 15))
        testData(9)
    }.run()

    println("Passing? $passing")

    //TwoSumSolution().twoSum(intArrayOf(2, 7, 11, 15), 9)
}


