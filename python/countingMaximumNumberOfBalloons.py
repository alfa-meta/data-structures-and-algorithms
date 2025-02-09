import math
def function(s: str) -> int:
    balloon_count: dict = {}
    balloon: str = "balloon"

    for i in balloon:
        if i not in balloon_count:
            balloon_count[i] = 1
        else:
            balloon_count[i] += 1

    char_count: dict = {}

    for char in balloon:
        char_count[char] = 0

    for j in s:
        if j in balloon:
            char_count[j] += 1

    print(char_count)
    ans = float('inf')

    for k in char_count.keys():
        if k == "l" or k == "o":
            ans = min(ans, math.floor(char_count[k]/2)) 
        else:
            ans = min(ans, char_count[k])

    return ans



print(function("nlaebolko"))
print(function("loonbalxballpoon"))
print(function("leetcode"))


