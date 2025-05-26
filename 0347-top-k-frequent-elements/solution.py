class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map={}
        nums.sort()
        c=0
        for i in range(0,len(nums)):
            c=c+1
            if(i<len(nums)-1 and nums[i]!=nums[i+1]):
                map[nums[i]]=c
                c=0
        map[nums[i]]=c
        map=dict(sorted(map.items(), key=lambda item: item[1]))
        c=0
        l=[]
        for key,value in map.items():
            if(c>=len(map)-k):
                l.append(key)
            c=c+1

        return l
