import math


def findMaxLength(nums: list[int]) -> int:
    count = 0
    max_length = 0
    # 0 starts at -1 to make sure that the numbers add up with an
    # equal amount of 0s and 1s
    count_index_map = {0: -1}  # Store first occurrence of count

    for i, num in enumerate(nums):
        count += 1 if num == 1 else -1  # Replace 0 with -1

        # Stores the first occurence of each count value.
        if count in count_index_map:
            max_length = max(max_length, i - count_index_map[count])
        else:
            count_index_map[count] = i

    return max_length


print(findMaxLength([0, 1]))
print(findMaxLength([0, 1, 0]))
print(findMaxLength([0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0]))