def is_pangram(s: str) -> bool:
    alphabet_set = set("abcdefghijklmnopqrstuvwxyz")
    s_set = set(s.lower())

    return alphabet_set.issubset(s_set)



print(is_pangram("thequickbrownfoxjumpsoverthelazydog"))
print(is_pangram("leetcode"))
print(is_pangram("packmyboxwithfivedozenliquorjugs"))
