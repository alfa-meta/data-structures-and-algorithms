from collections import defaultdict

def group_anagrams(strs: list[str]) -> list[str]:
    anagram_dict: dict = defaultdict(list)

    for i in strs:
        print(i)
        sorted_i = tuple(sorted(i))

        if sorted_i not in anagram_dict:
            anagram_dict[sorted_i] = [i]
        else:
            anagram_dict[sorted_i].append(i)

    return list(anagram_dict.values())

def group_anagrams_improved(strs: list[str]) -> list[str]:
    group = defaultdict(list)

    for i in strs:
        key = "".join(sorted(i))
        group[key].append(i)

    # We convert dictionary.values() to a list because it returns a view object.
    return list(group.values())


print(group_anagrams_improved(["eat", "tea", "tan", "ate", "nat", "bat", "bat"]))
print(group_anagrams_improved(["new", "wan", "wid", "diw", "iwd", "naw", "maw", "iwn"]))