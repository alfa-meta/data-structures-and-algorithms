import math

def twosum(list1, target) -> bool:
    length_of_list = len(list1)

    if length_of_list < 2:
        return False
    
    pointer1 = 0
    pointer2 = length_of_list - 1

    while pointer1 != pointer2:
        total = list1[pointer1] + list1[pointer2]
        
        if list1[pointer1] + list1[pointer2] == target:
            return True

        if total < target:
            pointer1 += 1
        else:
            pointer2 -= 1
        

    return False
    

list_of_nums = []
list_of_nums.append(([], 3, False))
list_of_nums.append(([2], 2, False))
list_of_nums.append(([1, 2, 3, 4], 5, True))
list_of_nums.append(([-1, -2, -3, -4], -5, True))
list_of_nums.append(([1, 2, 4, 6, 8, 9, 14, 15], 10, True))
list_of_nums.append(([1, 2, 3, 4, 5, 6, 7, 8], 88, False))

for nums, target,  flag in list_of_nums:
    answer = twosum(nums, target)
    if answer != flag:
        raise ValueError(f"The list of numbers: {nums} is incorrectly designated as {flag}, related to the target: {target} being a sum of two numbers in the list")
    else:
        print(f"The list:{nums}" + f" was correctly identified as {flag}, with the target being {target}")