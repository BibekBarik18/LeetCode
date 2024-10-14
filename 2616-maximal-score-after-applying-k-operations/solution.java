class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->b-a);
        for(int i=0;i<nums.length;i++)
        {
            pq.offer(nums[i]);
        }
        long sum=0;
        while(k>0)
        {
            int max=pq.poll();
            System.out.println(max);
            sum=sum+max;
            pq.add((int)Math.ceil(max/3.0));
            k--;
        }
        return sum;
    }
}
