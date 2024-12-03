/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peak(mountainArr);
        int ans=searchleft(mountainArr,target,0,peak);
        if(ans==-1)
        ans=searchright(mountainArr,target,peak+1,mountainArr.length()-1);
        return ans;
    }
    int searchleft(MountainArray mountainArr,int target,int s,int e)
    {
            while(s<=e)
            {
                int mid=s+(e-s)/2;
                System.out.println(s+" "+e);
                if(target<mountainArr.get(mid))
                e=mid-1;
                else if(target>mountainArr.get(mid))
                s=mid+1;
                else if(target==mountainArr.get(mid))
                return mid;
            }
        return -1;
    }
    int searchright(MountainArray mountainArr,int target,int s,int e)
    {
        while(s<=e)
            {
                int mid=s+(e-s)/2;
                if(target<mountainArr.get(mid))
                s=mid+1;
                else if(target>mountainArr.get(mid))
                e=mid-1;
                else
                return mid;
            }
            return -1;
    }
    int peak(MountainArray mountainArr)
    {
        int s=0;
        int e=mountainArr.length()-1;
        while(s<e)
        {
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1))
            e=mid;
            else
            s=mid+1;
        }
        return s;
    }
}
