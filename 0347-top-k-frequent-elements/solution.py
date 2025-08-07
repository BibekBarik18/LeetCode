class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map={}
        l=[[] for i in range(len(nums)+1)]

        for i in nums:
            map[i]=1+map.get(i,0)
        
        for c,v in map.items():
            l[v].append(c)

        ans=[]
        for i in range(len(l)-1,0,-1):
            for ele in l[i]:
                ans.append(ele)
                if len(ans)==k:
                    return ans
                    
