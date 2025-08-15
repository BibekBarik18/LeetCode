class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        max_a=0
        while l<r:
            cur_h=min(height[l],height[r])
            d=cur_h*(r-l)
            max_a=max(d,max_a)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return max_a
