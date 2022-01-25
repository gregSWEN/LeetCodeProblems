class Solution {
    public boolean isPalindrome(int x) {
        if((x < 0) ||(x % 10 == 0 && x!= 0)){
            return false;
        }
        
        int reverse = 0;
        while(x > reverse){
            int last = x % 10;
            reverse = reverse*10 + last;
            x /= 10;
        }
        
        return x == reverse || x == reverse / 10;
        
        
        
    }
}