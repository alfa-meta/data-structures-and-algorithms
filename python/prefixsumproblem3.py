import math

def my_function(nums: list, k: int):
    n = len(nums)
    output = [-1] * n  # Default to -1 for all indices
    if k == 0:  # Edge case when k = 0
        return nums

    if 2 * k + 1 > n:  # If k-radius is larger than the array size
        return output

    # Calculate the prefix sum
    prefix = [0] * n
    prefix[0] = nums[0]
    for j in range(1, n):
        prefix[j] = nums[j] + prefix[j - 1]

    # Compute k-radius averages
    for i in range(k, n - k):
        total_sum = prefix[i + k] - (prefix[i - k - 1] if i - k > 0 else 0)
        output[i] = total_sum // (2 * k + 1)

    return output


print(my_function([7,4,3,9,1,8,5,2,6], 3))
print(my_function([100000], 0))
print(my_function([8], 100000))