class Tester(private val objectt: Any) {

    @OptIn(ExperimentalStdlibApi::class)
    private val functionName = objectt.javaClass.simpleName.split("Solution")[0].replaceFirstChar { it.toLowerCase() }

    fun runTest(vararg testData: Any) {

        val method = objectt.javaClass.declaredMethods.first { it.name == functionName }
        val paramTypes = method.parameterTypes

        val newData = mutableListOf<Any>(testData.indices.forEach { paramTypes[it].cast(testData[it]) })

        val result = method.invoke(objectt.javaClass.constructors[0].newInstance(), newData)
        println(result)

    }

}

fun test(toTest: Any): Boolean {

    if (toTest !is Solution) return false

    return true

}