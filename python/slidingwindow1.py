class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        current_sum = sum(nums[:k]) # We start at k index and everything before it is a sum.
        max_sum = current_sum

        for i in range(k, len(nums)): # We start iterating from k to i
            current_sum += nums[i] - nums[i - k] # We do i - (i-k) and we add the value to current_sum
            max_sum = max(max_sum, current_sum)

        # Return the maximum average
        return max_sum / k