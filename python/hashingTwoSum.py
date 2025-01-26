def twoSum(nums: list[int], target: int):
    dict = {}
    for i in range(len(nums)):
        num = target - nums[i]
        print(num)
        if (num in dict):
            return [i, dict[num]]
        
        dict[nums[i]] = i
    
    return [-1, 1]

print(twoSum([2,7,11,15], 9))
print(twoSum([3,2,4], 6))
print(twoSum([3,3], 6))
print(twoSum([21,10,3,18], 31))