def function(string: str):
    count_dict: dict = {}

    for i in string:
        count_dict[i] += 1

    if len(set(count_dict.values())) > 1:
        return False
    
    return True



print(function("abacbc"))
print(function("lool"))
print(function("aaabb"))
print(function("opopopopops"))