from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map=defaultdict(list)
        for i in strs:
            s=sorted(i)
            s1="".join(s)
            map[s1].append(i)
        # print(map)
        l=[]
        for key,value in map.items():
            l.append(value)
        return l

