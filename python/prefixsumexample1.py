def my_function(nums: list):
    print(nums)
    prefix = [nums[0]]

    for i in range (1, len(nums)):
        prefix.append(nums[i] + prefix[-1])

    count = 0

    for j in range(len(prefix) - 1):
        right = prefix[-1] - prefix[j]

        if prefix[j] >= right:
            count += 1

    return count

print(my_function([1,2,3,4,5,6,7]))
print(my_function([1,4]))
print(my_function([9,2,6,60]))
print(my_function([10,5,-8,7]))