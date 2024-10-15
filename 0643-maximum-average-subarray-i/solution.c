double findMaxAverage(int* nums, int numsSize, int k) {
    if (numsSize == 0 || k <= 0 || k > numsSize) {
        return 0; // Handle edge cases
    }

    double sum = 0;
    for (int i = 0; i < k; i++) {
        sum += nums[i]; // Initialize the sum with the first k elements
    }

    double max = sum; // Set max to the average of the first k elements

    for (int i = k; i < numsSize; i++) {
        sum += nums[i] - nums[i - k]; // Slide the window
        if (sum > max) {
            max = sum; // Update max if current sum is greater
        }
    }

    return max / k; // Return the maximum average
}

