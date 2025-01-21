def my_function(nums: list):
    print(nums)
    prefix = [nums[0]]
    lowest_num = nums[0]


    for i in range(1, len(nums)):
        current_num = nums[i] + prefix[-1]
        prefix.append(current_num)

        lowest_num = min(lowest_num, current_num)

    print(lowest_num)
    outcome = abs(1 - lowest_num)
    if outcome < 1:
        outcome = 1
    elif lowest_num > 1:
        outcome = 1
    return outcome

print(my_function([-3,2,-3,4,2]))
print(my_function([1, 2]))
print(my_function([1,-2,-3]))
print(my_function([0]))
print(my_function([-20, 0, 13, 90, -102]))
print(my_function([4,2,-1]))