class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        least=prices[0]
        max_pr=0
        for i in range(1,len(prices)):
            cur_pr=prices[i]-least
            max_pr=max(cur_pr,max_pr)
            least=min(prices[i],least)
        return max_pr
