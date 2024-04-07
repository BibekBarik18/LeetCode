class Solution(object):
    def minRemoveToMakeValid(self, s):
        """
        :type s: str
        :rtype: str
        """
        left=0
        right=0
        stack=[]
        for ch in s:
            if ch=='(':
                left+=1
            elif ch==')':
                right+=1
            if right>left:
                right-=1
            else:
                stack.append(ch)

        result=""
        while(stack):
            cr=stack.pop()
            if left>right and cr=='(':
                left-=1
            else:
                result+=cr

        return result[::-1]
