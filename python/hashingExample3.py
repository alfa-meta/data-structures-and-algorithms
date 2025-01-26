def uniqueNumbers(nums: list):
    print(nums)

    num_dict = {}
    ans = []
    length = len(nums)

    if length < 2:
        return [nums[0]]

    for i in range(length):
        if nums[i] not in num_dict:
            num_dict[nums[i]] = i

    for j in range(length):
        previous = nums[j] - 1
        next = nums[j] + 1
        if previous not in num_dict and next not in num_dict:
            ans.append(nums[j])

    return ans


## Leetcodes solution
def find_numbers(nums):
    ans = []
    nums = set(nums)

    for num in nums:
        if (num + 1 not in nums) and (num - 1 not in nums):
            ans.append(num)
    
    return ans

print(uniqueNumbers([1,2,3,4,5,20]))
print(uniqueNumbers([1,2,3,40,5,20]))
print(uniqueNumbers([1]))
print(uniqueNumbers([1,2,4,5,-7]))


print(find_numbers([1,2,3,4,5,20]))
print(find_numbers([1,2,3,40,5,20]))
print(find_numbers([1]))
print(find_numbers([1,2,4,5,-7]))