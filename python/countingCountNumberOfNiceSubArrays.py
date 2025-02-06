def function(nums: list[int], k: int) -> int:
    curr = ans = 0
    count: dict = {}
    count = 0

    for i in nums:
        curr += i
        if i % 2 == 0:
            count += 1
        
        if count > k:
            if curr[-1] % 0:
                count -= 1
            curr = curr - curr[-1]
        
        

    return 0


print(function([1,1, 2,1,1], 3 ))