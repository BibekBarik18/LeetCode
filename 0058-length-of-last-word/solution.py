class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        si=strip(s)
        print(si)
        i=len(si)-1
        c=0
        while(si[i]!=" "):
            c+=1
            i-=1
            if(i<0):
                break
        return c
