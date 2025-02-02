def counting_elements(nums: list) -> int:
    nums_dict = {}
    my_set = set(nums)
    for i in my_set:
        nums_dict[i] = 0

    count = 0
    for i in nums:
        if (i + 1) in nums_dict.keys():
            nums_dict[i] += 1
            count += 1

    return count


print(counting_elements([0,1,2,3,4,5,5,5,6,7]))
print(counting_elements([1,2,3]))
print(counting_elements([1,1,3,3,5,5,7,7]))