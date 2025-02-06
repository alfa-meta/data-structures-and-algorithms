from collections import defaultdict

def function(nums: list, k: int) -> int:
    counts = defaultdict(int)
    counts[0] = 1
    ans = curr = 0

    for i in nums:
        curr += i
        ans += counts[curr - k]
        counts[curr] += 1
    
    return ans


print(function([1,1,1], 2))
print(function([1,2,3], 3))