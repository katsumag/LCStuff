package addtwonumbers

import Solution
import java.lang.StringBuilder

class AddTwoNumbersSolution : Solution {

    fun constructTree(vararg values: Int): ListNode {

        var head: ListNode? = null
        var tail: ListNode? = null

        values.forEach {
            val new = ListNode(it)
            if (head == null) {
                head = new
                tail = new
            } else {
                tail!!.next = new
                tail = new
            }
        }

        return head!!

    }

    fun getRawNumbers(node: ListNode): IntArray {
        val raw = mutableListOf<Int>()
        var current: ListNode? = node
        while (current != null) {
            raw.add(current.value)
            current = current.next
        }
        return raw.toIntArray()
    }

    fun arrayToNum(list: List<Int>): Int {
        val sb = StringBuilder()
        list.forEach { sb.append(it) }
        return Integer.valueOf(sb.toString())
    }

    /*
    Reverse to get normal numbers
    Construct normal number from the tree - 2,4,3 becomes 342
    Add both new numbers
    Construct tree
    Reverse tree
     */
    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {

        val test = "3999999999".toInt()
        val one = arrayToNum(getRawNumbers(l1).reversed())
        val two = arrayToNum(getRawNumbers(l2).reversed())


        val result = one + two

        val individualResults = result.toString().toCharArray().map { it.toString() }.map { Integer.valueOf(it) }.reversed().toIntArray()

        return constructTree(*individualResults)
    }

}

fun main() {
    val solution = AddTwoNumbersSolution()
    val testOne = solution.constructTree(2,4,3)
    val testOneTwo = solution.constructTree(5,6,4)
    println(solution.getRawNumbers(solution.addTwoNumbers(testOne, testOneTwo)).contentToString())
    println(solution.getRawNumbers(solution.addTwoNumbers(solution.constructTree(0), solution.constructTree(0))).contentToString())
    println(solution.getRawNumbers(solution.addTwoNumbers(solution.constructTree(9,9,9,9,9,9,9), solution.constructTree(9,9,9,9))).contentToString())
    println(solution.getRawNumbers(solution.addTwoNumbers(solution.constructTree(9), solution.constructTree(1,9,9,9,9,9,9,9,9,9))).contentToString())
}