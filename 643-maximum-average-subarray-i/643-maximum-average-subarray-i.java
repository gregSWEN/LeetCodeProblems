class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int winStart = 0 ;
        double currAvg  = 0 ;
        double maxAvg   = Integer.MIN_VALUE;
        double sum  = 0;
        
        for(int winEnd = 0; winEnd < nums.length; winEnd++){
            sum += nums[winEnd];
            
            if(winEnd >= k -1){
                currAvg = sum / k;
                
                if(currAvg > maxAvg){
                    maxAvg = currAvg;
                }
                sum -= nums[winStart];
                winStart++;
                
            }
            
        }
        
        return maxAvg;
        
    }
}