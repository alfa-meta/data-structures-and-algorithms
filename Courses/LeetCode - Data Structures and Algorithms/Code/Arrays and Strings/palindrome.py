import math

def palindrome(word: str) -> bool:
    if len(word) <= 0:
        return False
    
    if len(word) == 1:
        return True
    
    number_of_steps = math.ceil(len(word)/2)
    word = "f" + word

    for step in range(number_of_steps):
        if word[step] != word[step*-1]:
            return False

    return True



list_of_words = []
list_of_words.append(("", False))
list_of_words.append(("a", True))
list_of_words.append(("bb", True))
list_of_words.append(("hannah", True))
list_of_words.append(("abaccus", False))
list_of_words.append(("suzuki", False))
list_of_words.append(("abcdcba", True))
list_of_words.append(("racecar", True))

for name, flag in list_of_words:
    outcome = palindrome(name)
    if outcome != flag:
        raise ValueError(f"The word: {name} is incorrectly designated as {flag}, related to it being a palindrome")
    else:
        print(f"{name}" + f" was correctly identified as {flag}, being a Palindrome")