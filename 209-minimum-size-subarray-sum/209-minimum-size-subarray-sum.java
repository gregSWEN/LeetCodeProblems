class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int winStart = 0;
        int sum = 0;
        
        for(int winEnd = 0; winEnd < nums.length; winEnd++){
            sum += nums[winEnd]; // Adding the first number in the array 
            
            while(sum >= target){
                minLength = Math.min(minLength, winEnd - winStart+1);
                sum -= nums[winStart];
                winStart++;
            }
        }
        
        if(minLength == Integer.MAX_VALUE){
            minLength = 0;
        }
        return minLength;
    }
}