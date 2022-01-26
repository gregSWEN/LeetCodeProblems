import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        // First add all the nums to a hashtable so that we can look for the complimetn 
        // Go through the nums in numbs again and see if the compliment is contained in the hashmap 
        
        Hashtable<Integer, Integer> table = new Hashtable<>();
        int[] out = new int[2];
        int compliment = 0;
        for(int i = 0; i < nums.length; i++){
            compliment = target - nums[i];
            if(table.containsKey(compliment)){
                return new int[]{table.get(compliment), i};
            }
            table.put(nums[i], i);   
        }
        
        return null;
    }
}