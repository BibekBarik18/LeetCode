class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        max_h=0
        while(l<r):
            cr=min(height[l],height[r])
            cur=cr*(r-l)
            max_h=max(cur,max_h)
            if(height[l]<height[r]):
                l+=1
            elif(height[l]==height[r]):
                l+=1
                r-=1
            else:
                r-=1
        return max_h
