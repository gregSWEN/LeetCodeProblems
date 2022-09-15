class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        mySet = set()
        for i in nums:
            if i in mySet:
                return True
            mySet.add(i)
            
        return False