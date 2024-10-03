class Solution(object):
    def arrayRankTransform(self, arr):
        arr1=arr[:]
        arr.sort()
        
        dict={}
        j=1
        for i in range (len(arr)):
            if arr[i] not in dict:
                dict[arr[i]]=j
                j+=1
        arr2=[]
        print(arr1)
        for i in range(len(arr1)):
            arr2.append(dict.get(arr1[i]))

        return arr2
