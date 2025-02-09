def function(matches: list[int]) -> list[int]:
    league_table: dict = {}
    ans = [[], []]
    
    for individual_match in matches:
        if individual_match[0] not in league_table:
            league_table[individual_match[0]] = 0
        
        if individual_match[1] not in league_table:
            league_table[individual_match[1]] = 1
        else:
            league_table[individual_match[1]] += 1

    for player in league_table.keys():
        print(player)
        if league_table[player] == 0:
            ans[0].append(player)
        elif league_table[player] == 1:
            ans[1].append(player)

    ans[0].sort()
    ans[1].sort()
    
    return ans




print(function([[1, 3], [2,3], [3,6], [5,6], [5,7], [4,5], [4,8], [4,9], [10,4], [10,9]]))
print(function([[2,3],[1,3],[5,4],[6,4]]))