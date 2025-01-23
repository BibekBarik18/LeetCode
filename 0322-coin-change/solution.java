class Solution {
    public int coinChange(int[] coins, int amount) {
        // Initialize a DP array to store the minimum coins required for each amount
        int[] dp = new int[amount + 1];
        
        // Fill the dp array with a large number (indicating impossible to form that amount)
        Arrays.fill(dp, amount + 1);
        
        // Base case: zero amount requires zero coins
        dp[0] = 0;
        
        // Loop through each coin and update the dp array
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        
        // If dp[amount] is still a large number, return -1 (impossible to form the amount)
        return dp[amount] > amount ? -1 : dp[amount];
    }
}

