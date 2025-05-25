class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map={}
        for word in strs:
            s=''.join(sorted(word))
            if s not in map:
                map[s]=[]
                map[s].append(word)
            else:
                map[s].append(word)

        ans=[]
        for key,value in map.items():
            ans.append(value)
        return ans
