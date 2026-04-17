import math

def is_subsequence(s, t) -> bool:
    length_of_s = len(s)

    if length_of_s > len(t):
        return False

    pntr1 = 0

    for char in t:
        if s[pntr1] == char:
            pntr1 += 1
            if pntr1 == length_of_s:
                return True
    
    return False
    

list_of_words= []
list_of_words.append(("a", "ab", True))
list_of_words.append(("ab", "a", False))
list_of_words.append(("abba", "ab", False))
list_of_words.append(("1a1", "1a1b", True))
list_of_words.append(("Tom", "Tomas", True))
list_of_words.append((" ", "a and b", True))
list_of_words.append(("", "", False))
list_of_words.append(("ace", "abcde", True))


for s, t, target in list_of_words:
    answer = is_subsequence(s, t)
    if answer != target:
        raise ValueError(f"The list of words: s=`{s}` + t=`{t}` is incorrectly designated as `{answer}`")
    else:
        print(f"The word: `{s}`" + f" was correctly identified as `{target}` as a subsequence of `{t}`")