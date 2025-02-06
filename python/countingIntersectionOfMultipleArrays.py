def function(nums: list):
    ans: list = []
    length: int = len(nums)
    count_dict: dict = {}

    for i in nums:
        for j in i:
            if j in count_dict:
                count_dict[j] += 1
            else:
                count_dict[j] = 1

            if count_dict[j] == length:
                ans.append(j)
    
    
    return ans


print(function([[3, 1, 2, 4, 5], [1, 2, 3, 4], [3, 4, 5, 6]]))
print(function([[5],[5], [5], [5], [5], [5]]))
print(function([[0], [1], [3]]))