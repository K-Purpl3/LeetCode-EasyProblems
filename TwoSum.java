import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap();

        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];

            if (numMap.containsKey(complement)){
                return new int[] { numMap.get(complement),i };
            }
            numMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

//Accepted
//Case 1
/*
*Input
*  nums = [2,7,11,15]
*  target = 9
*Output
*  [0,1]
*Expected
*  [0,1]
*/
