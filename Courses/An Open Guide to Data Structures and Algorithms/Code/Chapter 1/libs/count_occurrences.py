def count_occurrences(x_char: str, s_string: str) -> int:
    length_of_x = len(x_char)

    if length_of_x is not 1:
        return 0
    
    length_of_s = len(s_string)

    if (length_of_s < 1 or (length_of_s < length_of_x)):
        return 0

    count = 0
    for char in s_string:
        if char == x_char:
            count += 1

    return count




