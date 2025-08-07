class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums)<2:
            return len(nums)
        nums.sort()
        c=1
        max=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]+1:
                c+=1
                if max<c:
                    max=c
            elif nums[i]==nums[i-1]:
                continue
            else:
                c=1
        return max
