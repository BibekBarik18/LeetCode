class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        cont=set()
        max_o=0
        l=0
        r=0
        while(r<len(s)):
            if s[r] not in cont:
                cont.add(s[r])
                r+=1
                max_o=max(len(cont),max_o)
            else:
                for i in range(l,r):
                    cont.remove(s[i])
                    if s[i]==s[r]:
                        l=i+1
                        break
        return max_o

