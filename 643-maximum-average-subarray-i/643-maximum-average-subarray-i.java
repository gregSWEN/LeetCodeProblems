import java.util.ArrayList;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        //First sliding window problem
        double winSum = 0;
        int winStart = 0;
        double maxAverage = Integer.MIN_VALUE;
        double currAverage = 0;
        for(int winEnd=0; winEnd<nums.length; winEnd++){
            winSum += nums[winEnd];
            
            
            if(winEnd >= k - 1){ // If we get to the end of the first window
                currAverage = winSum/k;
                if(currAverage>maxAverage){
                    maxAverage = currAverage;
                }
                winSum -= nums[winStart]; // Subtract the element leaving the window
                winStart++;
            }
        }
        return maxAverage;
        
    }
}