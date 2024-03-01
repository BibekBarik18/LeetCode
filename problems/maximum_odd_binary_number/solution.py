class Solution(object):
    def maximumOddBinaryNumber(self, s):
        """
        :type s: str
        :rtype: str
        """
        si=sorted(s,reverse=True)
        
        for i in range(len(si)-1,-1,-1):
            if(si[i]=='1'):
                si[i],si[-1]=si[-1],si[i]
                break
        return ''.join(si)
        