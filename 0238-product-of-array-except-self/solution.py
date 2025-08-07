class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans=[]
        for i in range(0,len(nums)):
            ans.append(1)
        for i in range(0,len(nums)):
            if(i+1<len(nums)):
                ans[i+1]=nums[i]*ans[i]
        mul=nums[len(nums)-1]
        for i in range(len(ans)-2,-1,-1):
            ans[i]=mul*ans[i]
            mul*=nums[i]
        return ans

