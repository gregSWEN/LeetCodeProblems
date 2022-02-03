import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Go thorugh the array and add each value to a hash map
        //have the value as the key
        //if the key is already in the hashmap, return true 
        //else return false
        
        HashMap<Integer, Integer>map = new HashMap<>();
        
        for(int elt: nums){
            if(map.containsKey(elt)){
                return true;
            }
            map.put(elt, elt);
        }
        
        
        return false;
        
    }
}