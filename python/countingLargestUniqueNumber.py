def function(nums: list[int]) -> int:
    
    count: dict = {}
    count[-1] = 1
    ans = -1


    for num in nums:
        if num not in count:
            count[num] = 1
        else:
            count[num] += 1

    for i in count.keys():
        if count[i] == 1:
            ans = max(ans, i)

    return ans




print(function([5,7,3,9,4,9,8,3,1]))
print(function([9,9,8,8]))