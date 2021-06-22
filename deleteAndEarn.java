//Time complexity O(n)
//Space complexity O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {//house robber
    public int deleteAndEarn(int[] nums) {
        
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i ++){
            
            max = Math.max(nums[i],max);
        }
        
        int[] dp = new int[max+1];
        
        for(int i = 0; i < nums.length; i ++){
            
           dp[nums[i]] =  dp[nums[i]] + nums[i];
        }
        
        int skip = 0;
        int take = 0;
        
        for(int i = 1; i < dp.length; i ++){
            
            int temp = skip;
            skip = Math.max(skip,take);
            take = dp[i] + temp;
            //dp[i] = Math.max(skip,take);
            
        }
        
       
        return Math.max(skip,take);
    }
}