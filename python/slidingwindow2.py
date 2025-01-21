def longestOnes(nums: list[int], k: int) -> int:
    consecutive_numbers = 0
    zero_count = 0
    left = 0
    
    for i in range(len(nums)):
        if nums[i] == 0:
            zero_count += 1
            
        if nums[i] == 1:
            consecutive_numbers += 1
            
        while zero_count > k:
            consecutive_numbers -= 1
            if nums[left] == 0:
                zero_count -= 1
            left += 1    
        print(consecutive_numbers)
            
    return consecutive_numbers


nums = [1,1,1,0,0,0,1,1,1,1,0]
k = 2
print(longestOnes(nums, k))