class TestBuilder {

    private val testData = mutableListOf<Any>()
    private var objectt: Any = 123

    fun testData(vararg data: Any) = testData.addAll(data)

    fun toTest(clazz: Any) { objectt = clazz }

    @OptIn(ExperimentalStdlibApi::class)
    fun run(): Any {

        println(objectt)

        val functionName = objectt.javaClass.simpleName.split("Solution")[0].replaceFirstChar { it.toLowerCase() }
        println(functionName)
        val method = objectt.javaClass.declaredMethods.first { it.name == functionName }

        return method.invoke(objectt, *testData.toTypedArray())

    }

}

fun test(initializer: TestBuilder.() -> Unit): TestBuilder {

    return TestBuilder().apply { initializer }

}