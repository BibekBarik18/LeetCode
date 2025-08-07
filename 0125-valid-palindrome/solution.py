class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower().strip()
        if len(s)==0:
            return True
        
        ans=""
        for i in range(0,len(s)):
            s1=ord(s[i])
            if((s1>96 and s1<123)or(s1>=48 and s1<=57)):
                ans+=s[i]
        rev=ans[::-1]
        return ans==rev
        # l=0
        # r=len(s)-1
        # while(l<r):
        #     s1=ord(s[l])
        #     e1=ord(s[r])
        #     # print(s[l],s[r])
        #     if((s1>96 and s1<123)or(s1>=48 and s1<=57)) and ((e1>96 and e1<123)or(e1>=48 and e1<=57)):
        #         if(s[l]!=s[r]):
        #             return False
        #         else:
        #             l+=1
        #             r-=1
        #     elif(s1<95 or s1>122)and(s1<48 or s1>57):
        #         l+=1
        #     elif(e1<95 or e1>122)and(e1<48 or e1>57):
        #         r-=1
        #     # elif:
        #     #     l+=1
        #     # elif(e1<48 or e1>57):
        #     #     r-=1
        # return True
