class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int start = 0;
        
        for (int end = 0; end < nums.length; end++) {
            if (end == nums.length - 1 || nums[end] + 1 != nums[end + 1]) {
                if (start == end) {
                    result.add(nums[start] + "");
                } else {
                    result.add(nums[start] + "->" + nums[end]);
                }
                start = end + 1; 
            }
        }
        
        return result;
    }
}

