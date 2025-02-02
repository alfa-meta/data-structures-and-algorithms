def missing_number(nums: list) -> int:
    new_nums = []
    for i in range(len(nums) + 1):
        new_nums.append(i)
    
    return sum(new_nums) - sum(nums)


print(missing_number([3,0,1]))
print(missing_number([0,1]))
print(missing_number([9,6,4,2,3,5,7,0,1]))
print(missing_number([0,1,2,4,5]))