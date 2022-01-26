class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val answer = IntArray(2)
        
        val length = nums.size -1
        for(i in 0..length){
            
            for ( j in (i+1)..length){
                if((nums[i] + nums[j]) == target){
                    answer[0] = i
                    answer[1] = j
                }
            }
        }
        
        return answer
        
    }
}