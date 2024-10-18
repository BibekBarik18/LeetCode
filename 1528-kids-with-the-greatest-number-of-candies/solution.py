class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result=[]
        x=max(candies)
        for i in candies:
            if i+extraCandies>=x:
                result.append(True)
            else:
                result.append(False)
        return result
