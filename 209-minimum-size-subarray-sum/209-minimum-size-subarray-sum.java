class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int winStart = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int winEnd = 0; winEnd < nums.length; winEnd++){
            sum += nums[winEnd];
            
            while(sum >= target){
                minLength = Math.min(minLength, winEnd-winStart+1);
                
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