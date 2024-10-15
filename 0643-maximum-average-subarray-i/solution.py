class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        avg = 0
        for i in range(k):
            avg += nums[i]
        maximum = float(avg) / k
        for i in range(k,len(nums)):
            avg = avg+nums[i] - nums[i-k]
            current_avg = float(avg) / k
            maximum = max(maximum,current_avg)
        return maximum    
            

        
