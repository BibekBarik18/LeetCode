class Solution(object):
    def checkValidString(self, s):
        """
        :type s: str
        :rtype: bool
        """
        lmin=0
        lmax=0
        for i in s:
            if i=='(':
                lmin+=1
                lmax+=1
            elif i==')':
                lmin-=1
                lmax-=1
            elif i=='*':
                lmin-=1
                lmax+=1
            if lmax<0:
                return False
            elif lmin<0:
                lmin=0

        return lmin==0
