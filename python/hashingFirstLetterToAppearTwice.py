def repeatedCharacter(s: str):
    char_dict = {}
    for i in range(len(s)):

        if s[i] in char_dict:
            return s[i]

        char_dict[s[i]] = i

print(repeatedCharacter("abccbaacz"))
print(repeatedCharacter("abcdd"))
print(repeatedCharacter("defsaoidjawfs"))