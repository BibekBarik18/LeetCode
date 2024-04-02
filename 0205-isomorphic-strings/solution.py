class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if(len(s)!=len(t)):
            return False
        
        maps_to_t={}
        mapt_to_s={}
        for char_s,char_t in zip(s,t):
            if char_s not in maps_to_t and char_t not in mapt_to_s:
                maps_to_t[char_s]=char_t
                mapt_to_s[char_t]=char_s
            elif maps_to_t.get(char_s)!=char_t or mapt_to_s.get(char_t)!=char_s:
                return False
        return True
