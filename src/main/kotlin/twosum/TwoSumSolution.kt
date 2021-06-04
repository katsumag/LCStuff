package twosum

import Solution

class TwoSumSolution : Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        for (out in nums.indices) {
            for (`in` in nums.indices) {
                if (out == `in`) continue
                if (nums[out] + nums[`in`] == target) {
                    println("${nums[out]} + ${nums[`in`]} at $out and $`in` produce $target")
                    return intArrayOf(out, `in`)
                }
            }
        }

        return intArrayOf(0)
    }

}

fun main() {
    val solution = TwoSumSolution()
    println(solution.twoSum(intArrayOf(2,7,11,15), 9))
    println(solution.twoSum(intArrayOf(3,2,4), 6))
    println(solution.twoSum(intArrayOf(3,3), 6))
}