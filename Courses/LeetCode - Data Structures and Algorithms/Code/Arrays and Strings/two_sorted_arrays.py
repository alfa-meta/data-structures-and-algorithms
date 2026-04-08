import math

def two_sorted_arrays(list1, list2) -> list[int]:
    length_of_list1 = len(list1)
    length_of_list2 = len(list2)

    if length_of_list1 == 0:
        if length_of_list2 == 0:
            return []
        else:
            return list2
    else:
        if length_of_list2 == 0:
            return list1
    
    pointer1 = 0
    pointer2 = 0
    new_array = []
    length_of_new_array = len(new_array)

    while pointer1 < length_of_list1 and pointer2 < length_of_list2:
        if list1[pointer1] <= list2[pointer2]:
            new_array.append(list1[pointer1])
            pointer1 += 1
        else:
            new_array.append(list2[pointer2])
            pointer2 += 1
        print(pointer1)
        print(pointer2)
        print(new_array)

    new_array.extend(list1[pointer1:])
    new_array.extend(list2[pointer2:])

    return new_array
    

list_of_nums = []
list_of_nums.append(([], [], []))
list_of_nums.append(([2], [], [2]))
list_of_nums.append(([2], [1, 5], [1, 2, 5]))
list_of_nums.append(([1, 2, 3, 4], [3, 5], [1, 2, 3, 3, 4, 5]))
list_of_nums.append(([-4, -3, -2, -1], [-5], [-5, -4, -3, -2, -1]))
list_of_nums.append(([1, 2, 4, 6, 8, 9, 14, 15], [-2, 10], [-2, 1, 2, 4, 6, 8, 9, 10, 14, 15]))
list_of_nums.append(([1, 2, 3, 4, 5, 6, 7, 8, 91], [88, 90], [1, 2, 3, 4, 5, 6, 7, 8, 88, 90, 91]))

for nums1, nums2, target in list_of_nums:
    answer = two_sorted_arrays(nums1, nums2)
    if answer != target:
        raise ValueError(f"The list of numbers: {nums1} + {nums2} is incorrectly designated as {answer}, related to the target: {target} being a sum of two sorted lists")
    else:
        print(f"The list:{nums1} + {nums2}" + f" was correctly identified as {target}")