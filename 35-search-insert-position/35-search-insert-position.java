class Solution {
    public int searchInsert(int[] nums, int target) {
        int pivot;
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            pivot = left + (right - left) / 2;
            if(nums[pivot] == target){
                return pivot;
            }
            else if(nums[pivot] > target){
                right = pivot - 1;
            }
            else if(nums[pivot] < target){
                left = pivot + 1;
            }
        }
        return left;
        
        
    }
}