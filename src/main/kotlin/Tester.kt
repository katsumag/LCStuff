class TestBuilder {

    private val testData = mutableListOf<Any>()
    var toTest: Any = 123

    fun testData(vararg data: Any) = testData.addAll(data)

    @OptIn(ExperimentalStdlibApi::class)
    fun run(): Any {

        val functionName = toTest.javaClass.simpleName.split("Solution")[0].replaceFirstChar { it.toLowerCase() }

        val method = toTest.javaClass.declaredMethods.first { it.name == functionName }

        return method.returnType.cast(method.invoke(toTest, *testData.toTypedArray()))

    }

}

fun test(initializer: TestBuilder.() -> Unit): TestBuilder {

    return TestBuilder().apply(initializer)

}