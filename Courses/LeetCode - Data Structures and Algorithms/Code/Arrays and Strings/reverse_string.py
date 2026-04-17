import math

def reverseString(s: List[str]):
    """
    Do not return anything, modify s in-place instead.
    """
    if len(s) < 2:
        return
    
    left, right = 0, len(s) - 1


    while left < right:
        s[right], s[left] = s[right], s[left]

        right += 1
        left -= 1

    print(s)


list_of_words: List[Tuple] = []
list_of_words.append((["H","E","L","L","O"], ["O", "L", "L", "E", "H"]))



for s, target in list_of_words:
    reverseString(s[0])
    if s != target:
        raise ValueError(f"The list of words: s=`{s}` is incorrect")
    else:
        print(f"The word: `{s}`" + f" was correctly identified as `{target}` as a subsequence of `{target}`")