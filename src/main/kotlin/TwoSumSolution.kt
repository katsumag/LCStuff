class TwoSumSolution : Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        for (num in nums) {
            for (num2 in nums) {
                if (num + num2 == target) {
                    println("$num and $num2 produce $target at indexes ${nums.indexOf(num)} and ${nums.indexOf(num2)}")
                }
            }
        }

        return intArrayOf(0)
    }

}