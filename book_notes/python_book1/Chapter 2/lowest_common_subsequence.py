import numpy as np
global string1 
global string2
global table

string1 = "abcdefghi"
string2 = "cdgi"
table=np.zeros((len(string1)+1, len(string2)+1))

def LCS(i, j):
    if (string1[i-1]==string2[j-1]):
        table[i][j] = table[i-1][j-1]+1
    else:
        table[i][j] = max(table[i-1][j], table[i][j-1])


for i in range(1, len(string1)+1):
    for j in range(1, len(string2)+1):
        LCS(i, j)


print(table)