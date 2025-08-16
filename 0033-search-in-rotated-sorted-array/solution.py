class Solution:
    def peak(self, nums: List[int])->int:
        l=0
        r=len(nums)-1
        while(l<r):
            mid=l+(r-l)//2
            if(nums[mid]<nums[mid-1]):
                return mid
            elif(nums[mid]>nums[mid+1]):
                return mid+1
            elif(nums[mid]<nums[l]):
                r=mid
            else:
                l=mid+1
        return l
    
    def bin_search(self,s,e,target,nums)->int:
        while(s<=e):
            mid=s+(e-s)//2
            if(nums[mid]==target):
                return mid
            elif(nums[mid]>target):
                e=mid-1
            else:
                s=mid+1
        return -1

    def search(self, nums: List[int], target: int) -> int:

        p_ele=self.peak(nums)
        if p_ele==0:
            return self.bin_search(0,len(nums)-1,target,nums)
        if target==nums[p_ele]:
            return p_ele
        elif target>=nums[0]:
            return self.bin_search(0,p_ele-1,target,nums)
        else:
            return self.bin_search(p_ele+1,len(nums)-1,target,nums)
        return -1

    

