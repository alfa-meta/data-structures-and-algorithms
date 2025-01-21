def my_function(nums: list):
    print(nums)
    prefix = [nums[0]]

    for i in range(1, len(nums)):
        prefix.append(nums[i] + prefix[-1])

    return prefix

print(my_function([1, 2, 3, 4]))
print(my_function([1, 1, 1, 1, 1]))
print(my_function([3, 1, 2, 10, 1]))
print(my_function([0]))
print(my_function([1, 2, 3, 4, 0, 1, 20]))